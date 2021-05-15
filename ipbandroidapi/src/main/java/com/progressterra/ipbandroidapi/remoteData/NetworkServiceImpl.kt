package com.progressterra.ipbandroidapi.remoteData

import com.progressterra.ipbandroidapi.BuildConfig
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

internal class NetworkServiceImpl : NetworkService {

    private val accessKey: String = BuildConfig.ACCESS_KEY
    private val baseUrl: String = BuildConfig.API_URL


    private val clientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        .callTimeout(timeout, TimeUnit.MINUTES)
        .connectTimeout(timeout, TimeUnit.MINUTES)
        .readTimeout(timeout, TimeUnit.MINUTES)
        .writeTimeout(timeout, TimeUnit.MINUTES)
        .addInterceptor {
            val request = it.request().newBuilder()
                .addHeader("AccessKey", accessKey)
                .build()
            it.proceed(request)
        }

    private val retrofitBuilder = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(clientBuilder.build())
        .addConverterFactory(GsonConverterFactory.create())

    private var retrofit: Retrofit = retrofitBuilder.build()

    override fun <T> createService(apiClass: Class<T>): T = retrofit.create(apiClass)


    companion object {
        // Таймаут запроса в минутах
        private const val timeout = 1L

    }
}