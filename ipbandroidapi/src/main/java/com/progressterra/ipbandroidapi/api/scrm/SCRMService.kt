package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.scrm.models.requests.*
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartRequest
import com.progressterra.ipbandroidapi.api.scrm.models.responses.*
import com.progressterra.ipbandroidapi.api.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.deviceid.DeviceIdResponse
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.Response
import retrofit2.http.*

interface SCRMService {

    @POST("/api/v7/clients/login/start")
    suspend fun verificationChannelBegin(@Body request: VerificationStartRequest): VerificationStartResponse

    @POST("/api/v7/clients/login/end")
    suspend fun verificationChannelEnd(@Body request: VerificationEndRequest): VerificationEndResponse

    @GET("/api/v7/clients/{AccessToken}/fulldata")
    suspend fun clientInfoByToken(
        @Path("AccessToken") accessToken: String,
    ): ClientInfoResponse

    @GET("/api/v7/clients/{AccessToken}")
    suspend fun deviceIdByToken(
        @Path("AccessToken") accessToken: String,
    ): DeviceIdResponse

    @POST("api/v7/clients/accesstoken")
    suspend fun accessToken(@Body request: AccessTokenRequest): AccessTokenResponse

    @POST("/api/v7/clients/personalinfo/{AccessToken}")
    suspend fun setPersonalInfo(
        @Path("AccessToken") accessToken: String,
        @Body request: ClientInfoRequest
    ): ClientInfoResponse

    @POST("/api/v7/clients/email/{AccessToken}")
    suspend fun setEmail(
        @Path("AccessToken") accessToken: String,
        @Body request: EmailRequest
    ): EmailResponse

    @POST("/api/v7/clients/devicetoken/{AccessToken}")
    suspend fun setDeviceToken(
        @Path("AccessToken") accessToken: String,
        @Body request: DeviceParameters
    ): DeviceTokenResponse

    @POST("/api/v3/gamification/emailconfirm/sendlink")
    suspend fun confirmEmail(
        @Body confirmEmailRequest: ConfirmEmailRequest
    ): Response<BaseResponse>

    //TODO move
    @GET("referencedata/api/v1/cities")
    @Headers("Content-Type: application/json")
    suspend fun getCities(): Response<CitiesListResponse>

    //TODO move out
    @GET("/api/v1/clientpurchase/{AccessToken}")
    suspend fun getShopList(@Path("AccessToken") accessToken: String): Response<PurchasesListResponse>

    //TODO move out
    @Headers("Authorization: Token 444220bc01c3cb6a7bd102bdfb72175a2deee88e")
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getSuggestionsAddressFromDadata(@Body dadataSuggestionsRequest: DadataSuggestionsRequest): Response<DadataSuggestionResponse>
}


