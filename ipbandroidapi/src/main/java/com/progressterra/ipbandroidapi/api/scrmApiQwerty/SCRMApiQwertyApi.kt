package com.progressterra.ipbandroidapi.api.scrmApiQwerty

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateUserInfoRequest
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
    }

    interface ClientCity {
        /**
         *  Получаем город клиента
         */
        @GET("/api/v1/clientcity/{AccessToken}")
        @Headers("Content-Type: application/json")
        suspend fun getCityClient(@Path("AccessToken") accessToken: String): CityResponse
    }

    interface TestimonialControllerV3{

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