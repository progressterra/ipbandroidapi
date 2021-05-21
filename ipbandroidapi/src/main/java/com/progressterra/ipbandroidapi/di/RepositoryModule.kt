package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.interfaces.internal.Repository
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.repository.RepositoryImpl
import dagger.Module
import dagger.Provides

@Module
internal class RepositoryModule() {

    @Provides
    fun provideNetworkService(): NetworkService =
        NetworkServiceImpl()

    @Provides
    fun provideRepository(): RepositoryImpl =
        RepositoryImpl()
}