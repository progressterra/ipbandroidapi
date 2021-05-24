package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.repository.models.base.BaseResponse
import com.progressterra.ipbandroidapi.repository.models.base.ResponseWrapper
import retrofit2.Response

internal interface NetworkService {

    fun <T> createService(apiClass: Class<T>): T
    suspend fun <T : BaseResponse> baseRequest(request: suspend () -> Response<T>): ResponseWrapper<T>
}

internal inline fun <T> NetworkService.safeApiCall(responseFunction: () -> T): T? =
    try {
        responseFunction.invoke()
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }



