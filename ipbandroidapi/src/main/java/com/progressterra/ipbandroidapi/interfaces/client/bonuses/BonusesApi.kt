package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.GeneralInfoResponse

interface BonusesApi {

    suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse>
    suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse>

    companion object {
        fun getInstance(): BonusesApi {
            return BonusesApiImpl()
        }
    }
}