package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.cities.model.CityData
import com.progressterra.core.AbstractRepository
import com.progressterra.core.BadRequestException
import com.progressterra.core.HandleException

internal class BaseCitiesRepository(
    handleException: HandleException,
    private val service: CitiesService
) : CitiesRepository, AbstractRepository(handleException) {

    override suspend fun getCities(): Result<List<CityData>> = handle {
        val response = service.getCities()
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map { list ->
        list.dataList.map {
            CityData(it)
        }
    }
}