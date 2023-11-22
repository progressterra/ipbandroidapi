package com.progressterra.ipbandroidapi.core

import com.progressterra.ipbandroidapi.IpbAndroidApiSettings
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

interface NetworkService {

    fun <T> createService(apiClass: Class<T>, url: () -> String?, invalidateUrl: () -> Unit): T

    class Base : NetworkService {


        private fun createClient(url: () -> String?, invalidateUrl: () -> Unit): OkHttpClient =
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
                .addInterceptor(ExceptionInterceptor(url, invalidateUrl))
                .addInterceptor(loggingInterceptor()).build()


        override fun <T> createService(
            apiClass: Class<T>,
            url: () -> String?,
            invalidateUrl: () -> Unit
        ): T {
            val firstUrl = url()
            require(firstUrl != null)
            val retrofitBuilder = Retrofit.Builder()
                .baseUrl(firstUrl)
                .client(createClient(url, invalidateUrl))
                .addConverterFactory(GsonConverterFactory.create())
            return retrofitBuilder.build().create(apiClass)
        }

        private class ExceptionInterceptor(
            private val url: () -> String?,
            private val invalidateUrl: () -> Unit
        ) : Interceptor {

            override fun intercept(chain: Interceptor.Chain): Response {
                val request = chain.request()
                val oldUrl = request.url.toString()
                val responseDetails = oldUrl.substring(url()!!.length)
                return try {
                    chain.proceed(request)
                } catch (e: Exception) {
                    invalidateUrl()
                    val newUrl = url() ?: throw e
                    val newRequest = request.newBuilder()
                        .url(newUrl + responseDetails)
                        .build()
                    chain.proceed(newRequest)
                }
            }
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