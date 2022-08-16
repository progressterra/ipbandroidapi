package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.*
import com.progressterra.ipbandroidapi.interfaces.internal.BonusesRepository
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal class BonusesApiImpl : BonusesApi {

    private val repository: BonusesRepository = RepositoryImpl()

    override suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse> =
        repository.getAccessToken()

    override suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<BonusesInfo> =
        repository.getBonusesInfo(accessToken)
            .convertation { BonusesConverters.convertToBonusesInfo(it) }

    override suspend fun getTransactionsList(accessToken: String): ResponseWrapper<List<Transaction>> =
        repository.getTransactionsList(accessToken)
            .convertation { BonusesConverters.convertToTransactionList(it) }

    override suspend fun getTransactionsRaw(accessToken: String): ResponseWrapper<List<TransactionRaw>> =
        repository.getTransactionsList(accessToken)
            .convertation { BonusesConverters.convertToTransactionRaw(it) }


    override suspend fun getPurchasesList(accessToken: String): ResponseWrapper<List<Purchase>> {
        return repository.getPurchasesList(accessToken).convertation {
            BonusesConverters.convertToOrderList(it)
        }
    }

    override suspend fun getBonusMessageList(accessToken: String): ResponseWrapper<List<BonusMessage>> {
        return repository.getBonusMessagesList(accessToken).convertation {
            BonusesConverters.convertToBonusMessagesList(it)
        }
    }
}