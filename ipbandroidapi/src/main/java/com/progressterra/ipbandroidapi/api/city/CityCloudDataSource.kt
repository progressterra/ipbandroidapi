package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.city.model.AddCityRequest
import com.progressterra.ipbandroidapi.api.city.model.CityResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.base.BaseResponse

internal interface CityCloudDataSource {

    suspend fun setCity(accessToken: String, cityEntity: AddCityRequest): BaseResponse

    suspend fun clientCity(accessToken: String): CityResponse

    class Base(
        private val service: CityService,
        handleException: HandleException
    ) : CityCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun setCity(accessToken: String, cityEntity: AddCityRequest): BaseResponse = handle {
            service.setCity(accessToken, cityEntity)
        }

        override suspend fun clientCity(accessToken: String): CityResponse = handle {
            service.clientCity(accessToken)
        }
    }
}