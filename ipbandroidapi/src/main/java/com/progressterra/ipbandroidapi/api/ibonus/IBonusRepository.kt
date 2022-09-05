package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.model.*
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface IBonusRepository {

    suspend fun getGeneralInfo(accessToken: String): Result<GeneralInfo>

    suspend fun getTransactionsList(accessToken: String): Result<List<TransactionInfo>>

    suspend fun getBonusMessagesList(accessToken: String): Result<List<BonusInfo>>

    class Base(
        private val cloudDataSource: IBonusCloudDataSource
    ) : IBonusRepository, AbstractRepository() {

        override suspend fun getGeneralInfo(accessToken: String): Result<GeneralInfo> = handle {
            cloudDataSource.getGeneralInfo(accessToken)
        }.map { it.data.toGeneralInfo() }

        override suspend fun getTransactionsList(accessToken: String): Result<List<TransactionInfo>> =
            handle {
                cloudDataSource.getTransactionsList(accessToken)
            }.map { response -> response.dataList.map { it.toTransactionInfo() } }

        override suspend fun getBonusMessagesList(accessToken: String): Result<List<BonusInfo>> =
            handle {
                cloudDataSource.getBonusMessagesList(accessToken)
            }.map { response -> response.dataList.map { it.toBonusInfo() } }
    }
}