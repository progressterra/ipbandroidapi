package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.api.scrm.models.responses.*
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper

internal interface BonusesRepository {

    suspend fun bonusesInfo(accessToken: String): GeneralInfoResponse
    suspend fun transactionsList(accessToken: String): TransactionListResponse
    suspend fun purchasesList(accessToken: String): ResponseWrapper<PurchasesListResponse>
    suspend fun bonusMessagesList(accessToken: String): BonusesMessagesResponse

}