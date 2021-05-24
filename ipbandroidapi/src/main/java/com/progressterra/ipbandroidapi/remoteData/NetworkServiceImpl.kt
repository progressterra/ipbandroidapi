package com.progressterra.ipbandroidapi.remoteData

import android.util.Log
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.repository.models.base.BaseResponse
import com.progressterra.ipbandroidapi.repository.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.repository.models.base.ResponseWrapper
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

    override suspend fun <T : BaseResponse> baseRequest(request: suspend () -> Response<T>): ResponseWrapper<T> {
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
}