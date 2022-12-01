package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.AddCityRequest
import com.progressterra.ipbandroidapi.api.city.model.CityData
import com.progressterra.core.AbstractRepository
import com.progressterra.core.BadRequestException
import com.progressterra.core.HandleException

internal class BaseCityRepository(
    handleException: HandleException,
    private val service: CityService
) : CityRepository,
    AbstractRepository(handleException) {

    override suspend fun setCity(
        accessToken: String,
        cityData: CityData
    ): Result<Unit> = handle {
        val response = service.setCity(
            accessToken, AddCityRequest(
                cityData.cityFiasIdc,
                cityData.cityKladrId,
                cityData.cityName,
                cityData.idrfCity,
                cityData.latitude.toInt(),
                cityData.longitude.toInt()
            )
        )
        if (response.result?.status != 0)
            throw BadRequestException()
    }

    override suspend fun getCity(accessToken: String): Result<CityData> = handle {
        val response = service.clientCity(accessToken)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map { data -> data.city?.let { CityData(it) } ?: CityData() }
}