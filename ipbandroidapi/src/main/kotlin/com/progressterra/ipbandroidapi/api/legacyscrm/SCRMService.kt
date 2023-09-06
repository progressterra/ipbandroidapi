package com.progressterra.ipbandroidapi.api.legacyscrm

import com.progressterra.ipbandroidapi.api.legacyscrm.model.ClientDataIncome
import com.progressterra.ipbandroidapi.api.legacyscrm.model.ClientFullDataResultData
import com.progressterra.ipbandroidapi.api.legacyscrm.model.DeviceDataResultData
import com.progressterra.ipbandroidapi.api.legacyscrm.model.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.legacyscrm.model.IncomeChannelData
import com.progressterra.ipbandroidapi.api.legacyscrm.model.IncomeDataCreateAccessToken
import com.progressterra.ipbandroidapi.api.legacyscrm.model.IncomeDataEmail
import com.progressterra.ipbandroidapi.api.legacyscrm.model.IncomeDataForEndLogin
import com.progressterra.ipbandroidapi.api.legacyscrm.model.IncomeDeviceParameters
import com.progressterra.ipbandroidapi.api.legacyscrm.model.StringResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

//TODO после миграции хассп удалить

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


