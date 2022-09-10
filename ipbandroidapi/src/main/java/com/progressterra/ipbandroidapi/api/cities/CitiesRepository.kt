package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.cities.model.CityData

interface CitiesRepository {

    suspend fun getCities(): Result<List<CityData>>
}