package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.interfaces.internal.BonusesRepository
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal class BonusesApiImpl : BonusesApi {

    private val repository: BonusesRepository = RepositoryImpl()

    override suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse> =
        repository.getAccessToken()

    override suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<BonusesInfo> =
        repository.getBonusesInfo(accessToken)
            .convertation { GeneralInfoResponseConverter.convert(it?.data) }
}