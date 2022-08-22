package com.progressterra.ipbandroidapi.api.city

import com.progressterra.ipbandroidapi.api.iprobonusapi.models.CityResponse
import com.progressterra.ipbandroidapi.api.scrm.models.requests.AddCitiRequest
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.Response

interface CityRepository {

    suspend fun setCity(accessToken: String, cityEntity: AddCitiRequest): Response<BaseResponse>

    suspend fun clientCity(accessToken: String): CityResponse

    class Base(private val cityCloudDataSource: CityCloudDataSource) : CityRepository {

        override suspend fun setCity(accessToken: String, cityEntity: AddCitiRequest): Response<BaseResponse> = cityCloudDataSource.setCity(accessToken, cityEntity)

        override suspend fun clientCity(accessToken: String): CityResponse = cityCloudDataSource.clientCity(accessToken)
    }
}