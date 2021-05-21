package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import dagger.Module
import dagger.Provides

@Module
internal class RepositoryModule() {

    @Provides
    fun provideNetworkService(): NetworkService =
        NetworkServiceImpl()
}