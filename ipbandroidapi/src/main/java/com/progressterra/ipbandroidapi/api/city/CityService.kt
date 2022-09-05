package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.AddCityRequest
import com.progressterra.ipbandroidapi.api.city.model.CityResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.*

interface CityService {

    @POST("/api/v1/clientcity/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun setCity(
        @Path("AccessToken") AccessToken: String,
        @Body cityEntity: AddCityRequest
    ): BaseResponse

    @GET("/api/v1/clientcity/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun clientCity(@Path("AccessToken") accessToken: String): CityResponse
}