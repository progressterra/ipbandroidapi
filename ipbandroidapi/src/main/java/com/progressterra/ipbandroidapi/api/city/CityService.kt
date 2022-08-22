package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.iprobonusapi.models.CityResponse
import com.progressterra.ipbandroidapi.api.scrm.models.requests.AddCitiRequest
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.Response
import retrofit2.http.*

interface CityService {

    @POST("/api/v1/clientcity/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun setCity(
        @Path("AccessToken") AccessToken: String,
        @Body cityEntity: AddCitiRequest
    ): Response<BaseResponse>

    @GET("/api/v1/clientcity/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun clientCity(@Path("AccessToken") accessToken: String): CityResponse
}