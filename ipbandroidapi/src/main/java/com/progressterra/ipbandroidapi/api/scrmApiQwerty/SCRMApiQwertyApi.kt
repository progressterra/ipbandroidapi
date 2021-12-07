package com.progressterra.ipbandroidapi.api.scrmApiQwerty

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateUserInfoRequest
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.RemoveClientRequest
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.TestimonialRequest
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.http.*

internal interface SCRMApiQwertyApi {

    interface ClientManagement {
        // Инициируем удаление клиента - отправляем код подтверждения на основной канал (сейчас номер телефона)
        @POST("/client/management/{AccessToken}/remove/begin")
        suspend fun removeClientBegin(@Path("AccessToken") accessToken: String): BaseResponse

        //  Если код верификации отправленный на основной канал верен,
        // то удаляем клиента - ОЧИЩАЕМ ФИО, Дату рождения, Пол. Рвем запись в ClientChannel
        @POST("/client/management/{AccessToken}/remove/end")
        suspend fun removeClientEnd(
            @Path("AccessToken") accessToken: String,
            @Body removeClientRequest: RemoveClientRequest
        ): BaseResponse
    }


    interface ClientsV3 {
        /**
         * получение базовой информации о клиенте
         * */
        @GET("/api/v3/clients/{AccessToken}/withadditionalinfo")
        suspend fun getClientInfo(@Path("AccessToken") accessToken: String): ClientInfoResponse

        /**
         * обновление базовой информации о клиенте
         * */
        @POST("/api/v3/clients/personalinfo/{AccessToken}")
        suspend fun updatePersonalInfo(
            @Path("AccessToken") accessToken: String,
            @Body updatePersonalData: UpdateUserInfoRequest
        ): ClientInfoResponse

        /**
         * Возвращает клиента по 2-м параметрам Наименованию параметра и Значению параметра
         * phone/79999990000, email/name@mail.org
         *
         * @param AccessToken Токен доступа клиента
         * @param ParamName Наименование параметра
         * @param ParamValue Значение параметра
         * @return ответ сервера
         */
        @GET("/api/v3/clients/{AccessToken}/{ParamName}/{ParamValue}")
        @Headers("Content-Type: application/json")
        suspend fun getClientByParams(
            @Path("AccessToken") AccessToken: String,
            @Path("ParamName") ParamName: String,
            @Path("ParamValue") ParamValue: String
        ): ClientInfoResponse

        /**
         * Добавляет/обновлят device token, который используется для отправки сообщений
         */
        @POST("/api/v3/clients/devicetoken")
        suspend fun setDeviceToken(
            @Body deviceParameters: DeviceParameters
        ): ClientInfoResponse
    }

    interface ClientCity {
        /**
         *  Получаем город клиента
         */
        @GET("/api/v1/clientcity/{AccessToken}")
        @Headers("Content-Type: application/json")
        suspend fun getCityClient(@Path("AccessToken") accessToken: String): CityResponse
    }

    interface TestimonialControllerV3 {

        /**
         * Добавление нового отзыва
         */
        @POST("/api/v3/testimonials/{AccessToken}")
        suspend fun addTestimonial(
            @Path("AccessToken") accessToken: String,
            @Body testimonialRequest: TestimonialRequest
        ): BaseResponse
    }
}