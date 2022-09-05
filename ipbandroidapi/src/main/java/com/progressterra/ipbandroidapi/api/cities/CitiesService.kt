package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.cities.model.CitiesListResponse
import retrofit2.http.GET
import retrofit2.http.Headers

interface CitiesService {

    @GET("referencedata/api/v1/cities")
    @Headers("Content-Type: application/json")
    suspend fun getCities(): CitiesListResponse
}