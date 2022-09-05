package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.cities.model.City
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface CitiesRepository {

    suspend fun getCities(): Result<List<City>>

    class Base(
        private val cloudDataSource: CitiesCloudDataSource
    ) : CitiesRepository, AbstractRepository() {

        override suspend fun getCities(): Result<List<City>> = handle {
            cloudDataSource.getCities()
        }.map { list ->
            list.dataList.map {
                it.toCity()
            }
        }
    }
}