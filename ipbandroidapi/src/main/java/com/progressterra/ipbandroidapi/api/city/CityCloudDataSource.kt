package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.iprobonusapi.models.CityResponse
import com.progressterra.ipbandroidapi.api.scrm.models.requests.AddCitiRequest
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.remotedata.CloudDataSource
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.Response

interface CityCloudDataSource {

    suspend fun setCity(accessToken: String, cityEntity: AddCitiRequest): Response<BaseResponse>

    suspend fun clientCity(accessToken: String): CityResponse

    class Base(
        private val service: CityService,
        handleException: HandleException
    ) : CityCloudDataSource, CloudDataSource.Abstract(handleException) {

        override suspend fun setCity(accessToken: String, cityEntity: AddCitiRequest): Response<BaseResponse> = handle {
            service.setCity(accessToken, cityEntity)
        }

        override suspend fun clientCity(accessToken: String): CityResponse = handle {
            service.clientCity(accessToken)
        }
    }
}