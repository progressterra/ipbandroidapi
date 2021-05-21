package com.progressterra.ipbandroidapi.interfaces.internal

import android.util.Log
import com.progressterra.ipbandroidapi.repository.models.base.BaseResponse
import com.progressterra.ipbandroidapi.repository.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.repository.models.base.ResponseWrapper
import retrofit2.Response

internal interface NetworkService {

    fun <T> createService(apiClass: Class<T>): T
}

internal inline fun <T> NetworkService.safeApiCall(responseFunction: () -> T): T? =
    try {
        responseFunction.invoke()
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }

internal suspend fun <T : BaseResponse> baseRequest(request: suspend () -> Response<T>): ResponseWrapper<T> {
    // инициализируем обертку
    val responseWrapper = ResponseWrapper<T>()

    // по умолчанию устанавливаем состояние ошибки
    responseWrapper.globalResponseStatus = GlobalResponseStatus.ERROR
    try {
        val rawResponse = request.invoke()

        // проверяем код ответа
        if (rawResponse.isSuccessful && rawResponse.body() != null) {
            rawResponse.body().let {

                // проверяем внутренний код успеха
                return if (it?.result?.status != 0) {
                    responseWrapper.responseBody = it
                    responseWrapper.globalResponseStatus = GlobalResponseStatus.ERROR
                    responseWrapper
                } else {
                    responseWrapper.responseBody = it
                    responseWrapper.globalResponseStatus = GlobalResponseStatus.SUCCESS
                    responseWrapper
                }
            }
        } else {
            // возвращаем обертку с состоянием ошибки
            return responseWrapper
        }
    } catch (e: Exception) {
        // возвращаем обертку с состоянием ошибки
        Log.d("network_logging", e.toString())
        return responseWrapper
    }
}
