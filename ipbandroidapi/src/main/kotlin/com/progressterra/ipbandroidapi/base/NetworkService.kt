package com.progressterra.ipbandroidapi.base

import com.progressterra.ipbandroidapi.IpbAndroidApiSettings
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

interface NetworkService {

    fun <T> createService(apiClass: Class<T>, baseUrl: String): T

    class Base : NetworkService {


        private val clientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
            .callTimeout(NETWORK_CALL_TIMEOUT, TimeUnit.MILLISECONDS)
            .connectTimeout(NETWORK_CONNECT_TIMEOUT, TimeUnit.MILLISECONDS)
            .readTimeout(NETWORK_READ_TIMEOUT, TimeUnit.MILLISECONDS)
            .writeTimeout(NETWORK_WRITE_TIMEOUT, TimeUnit.MILLISECONDS)
            .addInterceptor {
                val request = it.request().newBuilder()
                    .addHeader("AccessKey", IpbAndroidApiSettings.ACCESS_KEY)
                    .build()
                it.proceed(request)
            }
            .addInterceptor(loggingInterceptor())


        override fun <T> createService(apiClass: Class<T>, baseUrl: String): T {
            val retrofitBuilder = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
            return retrofitBuilder.build().create(apiClass)
        }

        private fun loggingInterceptor(): HttpLoggingInterceptor {
            val interceptor = HttpLoggingInterceptor()
            if (IpbAndroidApiSettings.DEBUG)
                interceptor.level = HttpLoggingInterceptor.Level.BODY
            else
                interceptor.level = HttpLoggingInterceptor.Level.NONE
            return interceptor
        }

        companion object {

            const val NETWORK_CALL_TIMEOUT: Long = 20 * 1000

            const val NETWORK_CONNECT_TIMEOUT: Long = 20 * 1000

            const val NETWORK_READ_TIMEOUT: Long = 20 * 1000

            const val NETWORK_WRITE_TIMEOUT: Long = 20 * 1000
        }
    }
}