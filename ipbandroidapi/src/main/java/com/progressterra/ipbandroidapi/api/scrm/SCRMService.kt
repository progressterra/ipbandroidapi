package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.models.requests.*
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartRequest
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.deviceid.DeviceIdResponse
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartResponse
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
}


