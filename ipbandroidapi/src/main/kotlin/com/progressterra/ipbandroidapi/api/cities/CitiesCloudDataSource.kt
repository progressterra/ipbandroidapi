package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.cities.model.CitiesListResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource

internal interface CitiesCloudDataSource {

    suspend fun getCities(): CitiesListResponse

    class Base(
        private val service: CitiesService,
        handleException: HandleException
    ) : CitiesCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun getCities(): CitiesListResponse = handle {
            service.getCities()
        }
    }
}