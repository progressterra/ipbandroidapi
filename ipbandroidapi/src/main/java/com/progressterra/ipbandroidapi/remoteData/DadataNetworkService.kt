package com.progressterra.ipbandroidapi.remoteData

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class DadataNetworkService : NetworkService() {

    override val retrofitBuilder: Retrofit.Builder =
        Retrofit.Builder()
            .baseUrl(NetworkSettings.DADATA_ROOT_URL)
            .client(clientBuilder.build())
            .addConverterFactory(GsonConverterFactory.create())


}