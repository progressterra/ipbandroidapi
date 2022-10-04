package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.model.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.GeneralBonusResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.TransactionListResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource

internal interface IBonusCloudDataSource {

    suspend fun getGeneralInfo(accessToken: String): GeneralBonusResponse

    suspend fun getTransactionsList(accessToken: String): TransactionListResponse

    suspend fun getBonusMessagesList(accessToken: String): BonusesMessagesResponse

    class Base(
        private val service: IBonusService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), IBonusCloudDataSource {

        override suspend fun getGeneralInfo(accessToken: String): GeneralBonusResponse = handle {
            service.getGeneralInfo(accessToken)
        }

        override suspend fun getTransactionsList(accessToken: String): TransactionListResponse = handle {
            service.getTransactionsList(accessToken)
        }

        override suspend fun getBonusMessagesList(accessToken: String): BonusesMessagesResponse = handle {
            service.getBonusMessagesList(accessToken)
        }
    }
}