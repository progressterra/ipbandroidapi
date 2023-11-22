package com.progressterra.ipbandroidapi.core

import com.progressterra.ipbandroidapi.IpbAndroidApiSettings
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

interface NetworkService {

    fun <T> createService(apiClass: Class<T>, urls: List<String>): T

    class Base : NetworkService {


        private fun createClient(urls: List<String>): OkHttpClient =
            OkHttpClient.Builder()
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
                .addInterceptor {
                    val request = it.request()
                    val baseUrl = urls[0]
                    val richUrl = request.url.toString()
                    val urlDetails = richUrl.substring(baseUrl.length)
                    try {
                        return@addInterceptor it.proceed(request)
                    } catch (e: Exception) {
                        for (index in 1 until urls.size) {
                            try {
                                val newRequest = request.newBuilder()
                                    .url(urls[index] + urlDetails)
                                    .build()
                                return@addInterceptor it.proceed(newRequest)
                            } catch (e: Exception) {
                                if (index == urls.lastIndex) throw e
                            }
                        }
                    }
                    return@addInterceptor it.proceed(request)
                }
                .addInterceptor(loggingInterceptor()).build()


        override fun <T> createService(
            apiClass: Class<T>,
            urls: List<String>
        ): T {
            require(urls.isNotEmpty())
            val retrofitBuilder = Retrofit.Builder()
                .baseUrl(urls[0])
                .client(createClient(urls))
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