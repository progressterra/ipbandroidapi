package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse

interface CitiesRepository {

    suspend fun getCities(): CitiesListResponse

    class Base(
        private val cloudDataSource: CitiesCloudDataSource
    ) : CitiesRepository {

        override suspend fun getCities(): CitiesListResponse = cloudDataSource.getCities()
    }
}