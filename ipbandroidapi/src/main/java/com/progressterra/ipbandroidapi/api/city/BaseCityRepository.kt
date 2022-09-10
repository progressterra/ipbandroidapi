package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.AddCityRequest
import com.progressterra.ipbandroidapi.api.city.model.CityData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseCityRepository(private val cloudDataSource: CityCloudDataSource) : CityRepository,
    AbstractRepository() {

    override suspend fun setCity(
        accessToken: String,
        cityData: CityData
    ): Result<Unit> = handle {
        val response = cloudDataSource.setCity(
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
        val response = cloudDataSource.clientCity(accessToken)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map { data -> data.city?.let { CityData(it) } ?: CityData() }
}