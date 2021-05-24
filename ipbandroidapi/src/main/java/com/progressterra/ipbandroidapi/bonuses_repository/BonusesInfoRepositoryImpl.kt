package com.progressterra.ipbandroidapi.bonuses_repository

import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.scrm.ScrmApi
import com.progressterra.ipbandroidapi.repository.RepositoryImpl
import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenRequest
import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenResponse
import com.progressterra.ipbandroidapi.repository.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.repository.models.bonuses_info.GeneralInfoResponse

internal class BonusesInfoRepositoryImpl : BonusesRepository {

    private val repository: ScrmApi = RepositoryImpl()
    private val networkServiceImpl = NetworkServiceImpl()

    // временное решение, после будет глобальная инициализация где будут эти параметры получать
    private val accessTokenRequest = AccessTokenRequest(
        "",
        idClient = "2c44d8c2-c89a-472e-aab3-9a8a29142315",
        0,
        0,
        "device",
        paramValue = "7db72635-fd0a-46b9-813b-1627e3aa02ea",
        0
    )

    override suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse> {
        return networkServiceImpl.baseRequest { repository.getAccessToken(accessTokenRequest) }
    }

    override suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse> {
        return networkServiceImpl.baseRequest { repository.getGeneralInfo(accessToken) }
    }

}