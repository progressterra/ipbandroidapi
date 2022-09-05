package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.AddCityRequest
import com.progressterra.ipbandroidapi.api.city.model.CityInfo
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface CityRepository {

    suspend fun setCity(
        accessToken: String = "",
        cityFiasIdc: String = "",
        cityKladrId: String = "",
        cityName: String = "",
        idrfCity: String = "",
        latitude: Double = 0.0,
        longitude: Double = 0.0
    ): Result<Boolean>

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
        ): Result<Boolean> = handle {
            cloudDataSource.setCity(
                accessToken, AddCityRequest(
                    cityFiasIdc,
                    cityKladrId,
                    cityName,
                    idrfCity,
                    latitude.toInt(),
                    longitude.toInt()
                )
            )
        }.map {
            it.result?.status == 0
        }

        override suspend fun getCity(accessToken: String): Result<CityInfo> = handle {
            cloudDataSource.clientCity(accessToken)
        }.map { it.city?.toCityInfo() ?: CityInfo() }
    }
}