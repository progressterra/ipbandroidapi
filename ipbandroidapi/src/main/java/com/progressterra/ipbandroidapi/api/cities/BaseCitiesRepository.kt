package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.cities.model.CityData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseCitiesRepository(
    private val cloudDataSource: CitiesCloudDataSource
) : CitiesRepository, AbstractRepository() {

    override suspend fun getCities(): Result<List<CityData>> = handle {
        val response = cloudDataSource.getCities()
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map { list ->
        list.dataList.map {
            CityData(it)
        }
    }
}