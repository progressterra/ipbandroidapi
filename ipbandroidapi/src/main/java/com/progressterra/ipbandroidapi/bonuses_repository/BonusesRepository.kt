package com.progressterra.ipbandroidapi.bonuses_repository

import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenResponse
import com.progressterra.ipbandroidapi.repository.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.repository.models.bonuses_info.GeneralInfoResponse

internal interface BonusesRepository {
    suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse>
    suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse>

    companion object {
        fun getInstance(): BonusesRepository {
            return BonusesInfoRepositoryImpl()
        }
    }
}