package com.progressterra.ipbandroidapi.remoteData

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AddressesNetworkService : NetworkService() {
    override val retrofitBuilder = Retrofit.Builder()
        .baseUrl(NetworkSettings.LIKEDISLIKE_ROOT_URL)
        .client(clientBuilder.build())
        .addConverterFactory(GsonConverterFactory.create())
}