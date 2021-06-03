package com.progressterra.ipbandroidapi.remoteData.scrm

import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.AddCitiRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.CitiesListResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.AccessTokenRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.ParamRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.ClientInfoRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.VerificationRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.DeviceResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.GeneralInfoResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.VerificationResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response.ClientInfoResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.*
import retrofit2.Response
import retrofit2.http.*

internal interface ScrmApi {

    /**
     * Начало верификации канала
     *
     * @param verificationRequest данные верификации
     * @return ответ сервера
     */
    @POST("/api/v3/clients/verificationchannelbegin")
    @Headers("Content-Type: text/json")
    suspend fun verificationChannelBegin(@Body verificationRequest: VerificationRequest): ResultResponse

    /**
     * Окончание верификации канала
     *
     * @param verificationRequest данные верификации
     * @return ответ сервера
     */
    @POST("/api/v3/clients/verificationchannelend")
    @Headers("Content-Type: application/json")
    suspend fun verificationChannelEnd(@Body verificationRequest: VerificationRequest): Response<VerificationResponse>

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
    ): Response<ClientInfoResponse>

    /**
     * Создает нового клиента и возвращает объект клиента, который был создан
     *
     * @param paramRequest параметры
     * @return ответ сервера
     */
    @POST("/api/v3/clients")
    @Headers("Content-Type: application/json")
    suspend fun createNewClient(@Body paramRequest: ParamRequest): Response<ClientInfoResponse>

    /**
     * Добавляет новое устройство для клиента
     *
     * @param paramRequest параметры
     * @return ответ сервера
     */
    @POST("/api/v3/clients/device")
    @Headers("Content-Type: application/json")
    suspend fun addDevice(@Body paramRequest: ParamRequest): Response<DeviceResponse>

    /**
     * Добавляет номер телефона в связку с клиентом
     *
     * @param paramRequest параметры
     * @return ответ сервера
     */
    @POST("/api/v3/clients/phone")
    @Headers("Content-Type: application/json")
    suspend fun addPhone(@Body paramRequest: ParamRequest): Response<ClientInfoResponse>

    /**
     * Получение accesstoken
     */
    @POST("api/v3/clients/accesstoken")
    @Headers("Content-Type: application/json")
    suspend fun getAccessToken(@Body accessToken: AccessTokenRequest): Response<AccessTokenResponse>

    /**
     * Получение информации о бонусах клиента
     */
    @GET("api/v3/ibonus/generalinfo/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun getGeneralInfo(@Path("AccessToken") accessToken: String): Response<GeneralInfoResponse>


    /**
     * Установка персональных данных клиента, в ответ приходит обновленная модель
     */
    @POST("/api/v3/clients/personalinfo")
    @Headers("Content-Type: application/json")
    suspend fun addPersonalInfo(@Body personalInfoResponse: ClientInfoRequest): Response<ClientInfoResponse>

    /**
     * Установка почты клиента
     */
    @POST("/api/v3/clients/email")
    @Headers("Content-Type: application/json")
    suspend fun addEmail(@Body paramRequest: ParamRequest): Response<BaseResponse>

    /**
     * Отправка подтверждения на почту клиента
     */
    @POST("/api/v3/gamification/emailconfirm/sendlink")
    suspend fun confirmEmail(
        @Body confirmEmailRequest: ConfirmEmailRequest
    ): Response<BaseResponse>

    /**
     * Установка города клиента
     */
    @POST("/api/v1/clientcity/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun setCity(
        @Path("AccessToken") AccessToken: String,
        @Body cityEntity: AddCitiRequest
    ): Response<BaseResponse>

    /**
     * Получение списка городов доступных для выбора
     */
    @GET("referencedata/api/v1/cities")
    @Headers("Content-Type: application/json")
    suspend fun getCities(): Response<CitiesListResponse>

    /**
     * Предоставляет данные по всем транзакциям бонусов
     */
    @GET("/api/v3/ibonus/alltransaction/{AccessToken}")
    suspend fun getTransactionsList(@Path("AccessToken") accessToken: String): Response<TransactionListResponse>

    /**
     * Получение списка покупок
     */
    @GET("/api/v1/clientpurchase/{AccessToken}")
    suspend fun getShopList(@Path("AccessToken") accessToken: String): Response<PurchasesListResponse>

    /**
     * Получение списка бонусных сообщений
     */
    @GET("/api/v3/ibonus/infobytype/{AccessToken}")
    suspend fun getBonusMessagesList(@Path("AccessToken") accessToken: String): Response<BonusesMessagesResponse>

}


