package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface CitiesService {

    @GET("referencedata/api/v1/cities")
    @Headers("Content-Type: application/json")
    suspend fun getCities(): CitiesListResponse
}