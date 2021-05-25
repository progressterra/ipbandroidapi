package com.progressterra.ipbandroidapi.bonuses_repository

import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenResponse
import com.progressterra.ipbandroidapi.repository.models.base.ResponseWrapper

interface BonusesRepository {
    suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse>
    suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<BonusesInfo>

    companion object {
        fun getInstance(): BonusesRepository {
            return BonusesInfoRepositoryImpl()
        }
    }
}