package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.di.DaggerRepositoryComponent
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.interfaces.internal.Repository
import javax.inject.Inject

internal class RepositoryImpl : Repository {

    @Inject
    lateinit var networkService: NetworkService

    init {
        DaggerRepositoryComponent.builder()
            .build()
            .inject(this)
    }

    // TODO: 14.05.2021 private val bonusApi  = networkService.createService(bonusapimodel)
    // TODO: 14.05.2021 private val xxxApi = networkService.createService(xxxmodel)
    // TODO: 14.05.2021 private val localDataSource?
}