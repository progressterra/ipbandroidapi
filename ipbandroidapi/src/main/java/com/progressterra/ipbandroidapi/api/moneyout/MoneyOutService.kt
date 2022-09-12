package com.progressterra.ipbandroidapi.api.moneyout

import com.progressterra.ipbandroidapi.api.moneyout.model.ApplicationsResponse
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesRequest
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5087/docsapi/v1/index.html)
 */
internal interface MoneyOutService {

    @POST("/moneyout")
    suspend fun removeBonuses(
        @Body removeBonusesRequest: RemoveBonusesRequest
    ): RemoveBonusesResponse

    @GET("/moneyout/list/{AccessToken}/confirm")
    suspend fun getConfirmedApplications(
        @Path("AccessToken") accessToken: String
    ): ApplicationsResponse

    @GET("/moneyout/list/{AccessToken}/notconfirm")
    suspend fun getNotConfirmedApplications(
        @Path("AccessToken") accessToken: String
    ): ApplicationsResponse
}