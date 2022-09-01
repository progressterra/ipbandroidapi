package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.remotedata.CloudDataSource

interface CitiesCloudDataSource {

    suspend fun getCities(): CitiesListResponse

    class Base(
        private val service: CitiesService,
        handleException: HandleException
    ) : CitiesCloudDataSource, CloudDataSource.Abstract(handleException) {

        override suspend fun getCities(): CitiesListResponse = handle {
            service.getCities()
        }
    }
}