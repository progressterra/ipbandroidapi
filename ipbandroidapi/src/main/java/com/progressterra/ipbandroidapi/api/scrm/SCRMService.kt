package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.*
import com.progressterra.ipbandroidapi.api.scrm.model.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.model.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.model.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceIdResponse
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceTokenResponse
import retrofit2.http.*

/**
 * [Docs](http://84.201.188.117:7021/docsapi/v7/index.html)
 */
internal interface SCRMService {

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


