package com.progressterra.ipbandroidapi.api.moneyout

import com.progressterra.ipbandroidapi.api.ambassador.models.ApplicationsResponse
import com.progressterra.ipbandroidapi.api.ambassador.models.RemoveBonusesRequest
import com.progressterra.ipbandroidapi.api.ambassador.models.RemoveBonusesResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MoneyOutService {

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