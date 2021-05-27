package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse

interface BonusesApi {

    suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse>
    suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<BonusesInfo>
    suspend fun getTransactionsList(accessToken: String): ResponseWrapper<List<Transaction>>
    suspend fun getPurchasesList(accessToken: String): ResponseWrapper<List<Purchase>>

    companion object {
        fun getInstance(): BonusesApi {
            return BonusesApiImpl()
        }
    }
}