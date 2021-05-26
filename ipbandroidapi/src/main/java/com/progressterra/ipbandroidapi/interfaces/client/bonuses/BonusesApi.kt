package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.ShopListResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.TransactionListResponse

interface BonusesApi {

    suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse>
    suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<BonusesInfo>
    suspend fun getTransactionsList(accessToken: String): ResponseWrapper<TransactionList>
    suspend fun getShopList(accessToken: String): ResponseWrapper<ShopListResponse>

    companion object {
        fun getInstance(): BonusesApi {
            return BonusesApiImpl()
        }
    }
}