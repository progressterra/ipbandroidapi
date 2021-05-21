package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.di.DaggerRepositoryComponent
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.scrm.ScrmRepository
import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenRequest
import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenResponse
import com.progressterra.ipbandroidapi.repository.models.bonuses_info.GeneralInfoResponse
import retrofit2.Response
import javax.inject.Inject

internal class RepositoryImpl : ScrmRepository {

    @Inject
    lateinit var networkService: NetworkService

    init {
        DaggerRepositoryComponent.builder()
            .build()
            .inject(this)
    }

    override suspend fun getAccessToken(accessToken: AccessTokenRequest): Response<AccessTokenResponse> {
        return networkService.createService(ScrmRepository::class.java).getAccessToken(accessToken)
    }

    override suspend fun getGeneralInfo(accessToken: String): Response<GeneralInfoResponse> {
        return networkService.createService(ScrmRepository::class.java).getGeneralInfo(accessToken)
    }

    // TODO: 14.05.2021 private val bonusApi  = networkService.createService(bonusapimodel)
    // TODO: 14.05.2021 private val xxxApi = networkService.createService(xxxmodel)
    // TODO: 14.05.2021 private val localDataSource?
}