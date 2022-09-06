package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.AddCityRequest
import com.progressterra.ipbandroidapi.api.city.model.CityInfo
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

interface CityRepository {

    suspend fun setCity(
        accessToken: String = "",
        cityFiasIdc: String = "",
        cityKladrId: String = "",
        cityName: String = "",
        idrfCity: String = "",
        latitude: Double = 0.0,
        longitude: Double = 0.0
    ): Result<Unit>

    suspend fun getCity(accessToken: String = ""): Result<CityInfo>

    class Base(private val cloudDataSource: CityCloudDataSource) : CityRepository,
        AbstractRepository() {

        override suspend fun setCity(
            accessToken: String,
            cityFiasIdc: String,
            cityKladrId: String,
            cityName: String,
            idrfCity: String,
            latitude: Double,
            longitude: Double
        ): Result<Unit> = handle {
            val response = cloudDataSource.setCity(
                accessToken, AddCityRequest(
                    cityFiasIdc,
                    cityKladrId,
                    cityName,
                    idrfCity,
                    latitude.toInt(),
                    longitude.toInt()
                )
            )
            if (response.result?.status != 0)
                throw BadRequestException()
        }

        override suspend fun getCity(accessToken: String): Result<CityInfo> = handle {
            cloudDataSource.clientCity(accessToken)
        }.map { it.city?.toCityInfo() ?: CityInfo() }
    }
}