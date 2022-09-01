package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.AddCityRequest
import com.progressterra.ipbandroidapi.api.city.model.CityResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

interface CityRepository {

    suspend fun setCity(accessToken: String, cityEntity: AddCityRequest): BaseResponse

    suspend fun getCity(accessToken: String): CityResponse

    class Base(private val cloudDataSource: CityCloudDataSource) : CityRepository {

        override suspend fun setCity(
            accessToken: String,
            cityEntity: AddCityRequest
        ): BaseResponse = cloudDataSource.setCity(accessToken, cityEntity)

        override suspend fun getCity(accessToken: String): CityResponse =
            cloudDataSource.clientCity(accessToken)
    }
}