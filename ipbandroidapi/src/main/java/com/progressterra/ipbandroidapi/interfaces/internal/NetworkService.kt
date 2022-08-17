package com.progressterra.ipbandroidapi.interfaces.internal

import android.util.Log
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import retrofit2.Response

internal interface NetworkService {

    fun <T> createService(apiClass: Class<T>, baseUrl: String): T

    suspend fun <T> handle(block: suspend () -> T): T

        abstract class Abstract(private val handleException: HandleException) : NetworkService {

        override suspend fun <T> handle(block: suspend () -> T): T =
            try {
                block.invoke()
            } catch (exception: Exception) {
                throw handleException.handle(exception)
            }
    }

    /**
    Метод предназначен для совершения запросов в сеть. Благодаря ему основываясь на коде ответа Http,
    внутреннем статусе запроса, формируется обертка со статусом успеха, данным получеными в запросе,
    и сообщением об ошибке, при его наличии
     */
    suspend fun <T : BaseResponse> baseRequest(request: suspend () -> Response<T>): ResponseWrapper<T> {
        val responseWrapper = ResponseWrapper<T>()

        // по умолчанию устанавливаем состояние ошибки, в дальнейшем при успехе оно измениться
        responseWrapper.globalResponseStatus = GlobalResponseStatus.ERROR
        try {
            val rawResponse = request.invoke()

            // проверяем код ответа
            if (rawResponse.isSuccessful && rawResponse.body() != null) {
                rawResponse.body().let {
                    // проверяем внутренний код успеха ( есть два базовых типов ответа: где данные об успехе в теле или в объекте result)
                    // следовательно либо result либо данные в теле будут null
                    // поэтому проверяем в двух местах
                    return if (it?.result?.status == 0 || it?.status == 0) {
                        responseWrapper.responseBody = it
                        responseWrapper.globalResponseStatus = GlobalResponseStatus.SUCCESS
                        responseWrapper
                    } else {
                        // текст сообщения об ошибке по логике описанной выше смотрим также в двух местах
                        if (it?.message != null) {
                            responseWrapper.errorString = it.message
                        } else if (it?.result?.message != null) {
                            responseWrapper.errorString = it.result.message
                        }

                        responseWrapper.responseBody = it
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
}