package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.*
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper

interface BonusesApi {

    suspend fun getBonusesInfo(accessToken: String): BonusesInfo
    suspend fun getTransactionsList(accessToken: String): List<Transaction>
    suspend fun getPurchasesList(accessToken: String): ResponseWrapper<List<Purchase>>
    suspend fun getBonusMessageList(accessToken: String): List<BonusMessage>
    suspend fun getTransactionsRaw(accessToken: String): List<TransactionRaw>

    companion object {
        fun getInstance(): BonusesApi {
            return BonusesApiImpl()
        }
    }
}