package com.progressterra.ipbandroidapi.remoteData.scrm

import com.progressterra.ipbandroidapi.interfaces.client.login.models.CreateClientWithoutPhoneRequest
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.Address
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.*
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.accesstoken.AccessTokenRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.verification.VerificationStartRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.*
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.TransactionListResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response.ClientInfoResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.verification.VerificationEndResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.verification.VerificationStartResponse
import retrofit2.Response
import retrofit2.http.*

internal interface ScrmService {

    /**
     * Начало верификации канала
     */
    @POST("/api/v7/clients/login/start")
    suspend fun verificationChannelBegin(@Body verificationStart: VerificationStartRequest): VerificationStartResponse

    /**
     * Окончание верификации канала
     */
    @POST("/api/v7/clients/login/end")
    suspend fun verificationChannelEnd(@Body verificationEnd: VerificationEndRequest): VerificationEndResponse

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
    @POST("api/v7/clients/accesstoken")
    suspend fun accessToken(@Body accessToken: AccessTokenRequest): AccessTokenResponse

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

    @POST("/api/v3/clients/createat")
    suspend fun createClientWithoutPhone(@Body createClientWithoutPhoneRequest: CreateClientWithoutPhoneRequest): Response<AccessTokenResponse>

    /**
     * получение списка адресов для текущего клиента
     */
    @GET("/api/v3/addressclient/list/{AccessToken}")
    suspend fun getAddressList(@Path("AccessToken") accessToken: String): Response<ListOfAddressesResponse>

    /**
     * добавить новый адресс
     */
    @POST("/api/v3/addressclient/{AccessToken}")
    suspend fun addClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body modifyClientAddressRequest: Address
    ): Response<ResultResponse>

    /**
     * отредактировать существующий адресс
     */
    @PUT("/api/v3/addressclient/{AccessToken}")
    suspend fun updateClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body modifyClientAddressRequest: Address
    ): Response<ResultResponse>

    /**
     * получить список подсказок адресов по введенной строке
     */
    @Headers("Authorization: Token 444220bc01c3cb6a7bd102bdfb72175a2deee88e")
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getSuggestionsAddressFromDadata(@Body dadataSuggestionsRequest: DadataSuggestionsRequest): Response<DadataSuggestionResponse>
}


