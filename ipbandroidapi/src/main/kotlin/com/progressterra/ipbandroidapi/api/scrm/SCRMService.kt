package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.ClientDataIncome
import com.progressterra.ipbandroidapi.api.scrm.model.ClientFullDataResultData
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceDataResultData
import com.progressterra.ipbandroidapi.api.scrm.model.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeChannelData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataCreateAccessToken
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataEmail
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataForEndLogin
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.model.StringResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:7021/docsapi/v7/index.html)
 */
internal interface SCRMService {

    @POST("/api/v7/clients/login/start")
    suspend fun verificationChannelBegin(@Body request: IncomeChannelData): EmptyResultOperationResultData

    @POST("/api/v7/clients/login/end")
    suspend fun verificationChannelEnd(@Body request: IncomeDataForEndLogin): DeviceDataResultData

    @GET("/api/v7/clients/{AccessToken}/fulldata")
    suspend fun clientInfoByToken(
        @Path("AccessToken") accessToken: String,
    ): ClientFullDataResultData

    @POST("api/v7/clients/accesstoken")
    suspend fun accessToken(@Body request: IncomeDataCreateAccessToken): StringResultData

    @POST("/api/v7/clients/personalinfo/{AccessToken}")
    suspend fun setPersonalInfo(
        @Path("AccessToken") accessToken: String,
        @Body request: ClientDataIncome
    ): ClientFullDataResultData

    @POST("/api/v7/clients/email/{AccessToken}")
    suspend fun setEmail(
        @Path("AccessToken") accessToken: String,
        @Body request: IncomeDataEmail
    ): EmptyResultOperationResultData

    @POST("/api/v7/clients/devicetoken/{AccessToken}")
    suspend fun setDeviceToken(
        @Path("AccessToken") accessToken: String,
        @Body request: IncomeDeviceParameters
    ): EmptyResultOperationResultData
}


