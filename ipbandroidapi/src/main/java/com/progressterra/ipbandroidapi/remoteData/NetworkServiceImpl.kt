package com.progressterra.ipbandroidapi.remoteData

import android.util.Log
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

internal class NetworkServiceImpl : NetworkService {

    private val clientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        .callTimeout(NetworkSettings.NETWORK_CALL_TIMEOUT, TimeUnit.MILLISECONDS)
        .connectTimeout(NetworkSettings.NETWORK_CONNECT_TIMEOUT, TimeUnit.MILLISECONDS)
        .readTimeout(NetworkSettings.NETWORK_READ_TIMEOUT, TimeUnit.MILLISECONDS)
        .writeTimeout(NetworkSettings.NETWORK_WRITE_TIMEOUT, TimeUnit.MILLISECONDS)
        .addInterceptor(HttpLoggingInterceptor().apply { setLevel(HttpLoggingInterceptor.Level.BODY) })
        .addInterceptor {
            val request = it.request().newBuilder()
                .addHeader("AccessKey", NetworkSettings.ACCESS_KEY)
                .build()
            it.proceed(request)
        }

    private val retrofitBuilder = Retrofit.Builder()
        .baseUrl(NetworkSettings.LIKEDISLIKE_ROOT_URL)
        .client(clientBuilder.build())
        .addConverterFactory(GsonConverterFactory.create())

    private var retrofit: Retrofit = retrofitBuilder.build()

    override fun <T> createService(apiClass: Class<T>): T = retrofit.create(apiClass)


    /**
    Метод предназначен для совершения запросов в сеть. Благодаря ему основываясь на коде ответа Http,
    внутреннем статусе запроса, формируется обертка со статусом успеха, данным получеными в запросе,
    и сообщением об ошибке, при его наличии
     */
    override suspend fun <T : BaseResponse> baseRequest(request: suspend () -> Response<T>): ResponseWrapper<T> {
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


    override suspend fun <T> safeApiCall(responseFunction: suspend () -> T): T? =
        withContext(Dispatchers.IO) {
            try {
                responseFunction.invoke()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
}