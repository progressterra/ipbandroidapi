package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.Address
import com.progressterra.ipbandroidapi.api.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.scrm.models.requests.*
import com.progressterra.ipbandroidapi.api.scrm.models.requests.accesstoken.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.models.requests.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.models.requests.verification.VerificationStartRequest
import com.progressterra.ipbandroidapi.api.scrm.models.responses.*
import com.progressterra.ipbandroidapi.api.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.client_info_response.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.clientinfo.ClientInfoReponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.deviceid.DeviceIdResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.verification.VerificationEndResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.verification.VerificationStartResponse
import retrofit2.Response
import retrofit2.http.*

internal interface SCRMService {

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
     * Возвращает информацию про клиента по токену
     */
    @GET("/api/v7/clients/{AccessToken}/fulldata")
    suspend fun clientInfoByToken(
        @Path("AccessToken") AccessToken: String,
    ): ClientInfoReponse

    /**
     * Возвращает id клиента по токену
     */
    @GET("/api/v7/clients/{AccessToken}")
    suspend fun deviceIdByToken(
        @Path("AccessToken") accessToken: String,
    ): DeviceIdResponse

    /**
     * Получение accesstoken
     */
    @POST("api/v7/clients/accesstoken")
    suspend fun accessToken(@Body accessToken: AccessTokenRequest): AccessTokenResponse

    //TODO rework
    /**
     * Установка персональных данных клиента, в ответ приходит обновленная модель
     */
    @POST("/api/v3/clients/personalinfo")
    @Headers("Content-Type: application/json")
    suspend fun addPersonalInfo(@Body personalInfoResponse: ClientInfoRequest): Response<ClientInfoResponse>

    //TODO rework
    /**
     * Установка почты клиента
     */
    @POST("/api/v3/clients/email")
    @Headers("Content-Type: application/json")
    suspend fun addEmail(@Body paramRequest: ParamRequest): Response<BaseResponse>

    //TODO move
    /**
     * Установка города клиента
     */
    @POST("/api/v1/clientcity/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun setCity(
        @Path("AccessToken") AccessToken: String,
        @Body cityEntity: AddCitiRequest
    ): Response<BaseResponse>

    //TODO move
    /**
     * Получение списка городов доступных для выбора
     */
    @GET("referencedata/api/v1/cities")
    @Headers("Content-Type: application/json")
    suspend fun getCities(): Response<CitiesListResponse>


    //TODO move
    /**
     * Получение списка покупок
     */
    @GET("/api/v1/clientpurchase/{AccessToken}")
    suspend fun getShopList(@Path("AccessToken") accessToken: String): Response<PurchasesListResponse>

    //TODO move
    /**
     * получение списка адресов для текущего клиента
     */
    @GET("/api/v3/addressclient/list/{AccessToken}")
    suspend fun getAddressList(@Path("AccessToken") accessToken: String): Response<ListOfAddressesResponse>

    //TODO move
    /**
     * добавить новый адресс
     */
    @POST("/api/v3/addressclient/{AccessToken}")
    suspend fun addClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body modifyClientAddressRequest: Address
    ): Response<ResultResponse>

    //TODO move
    /**
     * отредактировать существующий адресс
     */
    @PUT("/api/v3/addressclient/{AccessToken}")
    suspend fun updateClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body modifyClientAddressRequest: Address
    ): Response<ResultResponse>

    //TODO move
    /**
     * получить список подсказок адресов по введенной строке
     */
    @Headers("Authorization: Token 444220bc01c3cb6a7bd102bdfb72175a2deee88e")
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getSuggestionsAddressFromDadata(@Body dadataSuggestionsRequest: DadataSuggestionsRequest): Response<DadataSuggestionResponse>
}


