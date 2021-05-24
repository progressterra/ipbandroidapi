package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import retrofit2.Response

internal interface NetworkService {

    fun <T> createService(apiClass: Class<T>): T

    suspend fun <T : BaseResponse> baseRequest(request: suspend () -> Response<T>): ResponseWrapper<T>

}