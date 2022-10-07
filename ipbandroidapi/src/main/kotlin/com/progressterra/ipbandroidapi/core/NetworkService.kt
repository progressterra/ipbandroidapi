package com.progressterra.ipbandroidapi.core

import com.progressterra.ipbandroidapi.BuildConfig
import com.progressterra.ipbandroidapi.NetworkSettings
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

internal interface NetworkService {

    fun <T> createService(apiClass: Class<T>, baseUrl: String): T

    class Base : NetworkService {


        private val clientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
            .callTimeout(NetworkSettings.NETWORK_CALL_TIMEOUT, TimeUnit.MILLISECONDS)
            .connectTimeout(NetworkSettings.NETWORK_CONNECT_TIMEOUT, TimeUnit.MILLISECONDS)
            .readTimeout(NetworkSettings.NETWORK_READ_TIMEOUT, TimeUnit.MILLISECONDS)
            .writeTimeout(NetworkSettings.NETWORK_WRITE_TIMEOUT, TimeUnit.MILLISECONDS)
            .addInterceptor(loggingInterceptor())
            .addInterceptor {
                val request = it.request().newBuilder()
                    .addHeader("AccessKey", NetworkSettings.ACCESS_KEY)
                    .build()
                it.proceed(request)
            }


        override fun <T> createService(apiClass: Class<T>, baseUrl: String): T {
            val retrofitBuilder = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
            return retrofitBuilder.build().create(apiClass)
        }

        private fun loggingInterceptor() : HttpLoggingInterceptor {
            val interceptor = HttpLoggingInterceptor()
            if (BuildConfig.DEBUG)
                interceptor.level = HttpLoggingInterceptor.Level.BODY
            else
                interceptor.level = HttpLoggingInterceptor.Level.NONE
            return interceptor
        }
    }
}