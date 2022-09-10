package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.CityData

interface CityRepository {

    suspend fun setCity(
        accessToken: String,
        cityData: CityData
    ): Result<Unit>

    suspend fun getCity(accessToken: String): Result<CityData>
}