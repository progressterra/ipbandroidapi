package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.*
import com.progressterra.ipbandroidapi.interfaces.internal.BonusesRepository
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal class BonusesApiImpl : BonusesApi {

    private val repository: BonusesRepository = RepositoryImpl()

    override suspend fun getBonusesInfo(accessToken: String): BonusesInfo =
        BonusesConverters.convertToBonusesInfo(repository.bonusesInfo(accessToken))

    override suspend fun getTransactionsList(accessToken: String): List<Transaction> =
        BonusesConverters.convertToTransactionList(repository.transactionsList(accessToken))

    override suspend fun getTransactionsRaw(accessToken: String): List<TransactionRaw> =
        BonusesConverters.convertToTransactionRaw(repository.transactionsList(accessToken))


    override suspend fun getPurchasesList(accessToken: String): ResponseWrapper<List<Purchase>> {
        return repository.purchasesList(accessToken).convertation {
            BonusesConverters.convertToOrderList(it)
        }
    }

    override suspend fun getBonusMessageList(accessToken: String): List<BonusMessage> =
            BonusesConverters.convertToBonusMessagesList(repository.bonusMessagesList(accessToken))
}