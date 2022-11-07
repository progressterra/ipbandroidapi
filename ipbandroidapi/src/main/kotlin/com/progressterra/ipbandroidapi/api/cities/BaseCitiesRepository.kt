package com.progressterra.ipbandroidapi.api.cities

import com.progressterra.ipbandroidapi.api.cities.model.CityData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

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