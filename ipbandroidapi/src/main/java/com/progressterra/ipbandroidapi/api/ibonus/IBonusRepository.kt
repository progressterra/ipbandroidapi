package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.model.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.GeneralInfoResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.TransactionListResponse

interface IBonusRepository {

    suspend fun getGeneralInfo(accessToken: String): GeneralInfoResponse

    suspend fun getTransactionsList(accessToken: String): TransactionListResponse

    suspend fun getBonusMessagesList(accessToken: String): BonusesMessagesResponse

    class Base(
        private val cloudDataSource: IBonusCloudDataSource
    ) : IBonusRepository {

        override suspend fun getGeneralInfo(accessToken: String): GeneralInfoResponse =
            cloudDataSource.getGeneralInfo(accessToken)

        override suspend fun getTransactionsList(accessToken: String): TransactionListResponse =
            cloudDataSource.getTransactionsList(accessToken)

        override suspend fun getBonusMessagesList(accessToken: String): BonusesMessagesResponse =
            cloudDataSource.getBonusMessagesList(accessToken)
    }
}