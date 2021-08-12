package com.progressterra.ipbandroidapi.remoteData

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

internal class IpbNetworkService : NetworkService {

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


}