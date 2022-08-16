package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.api.scrm.models.responses.*

internal interface BonusesRepository {

    suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse>
    suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse>
    suspend fun getTransactionsList(accessToken: String): ResponseWrapper<TransactionListResponse>
    suspend fun getPurchasesList(accessToken: String): ResponseWrapper<PurchasesListResponse>
    suspend fun getBonusMessagesList(accessToken: String): ResponseWrapper<BonusesMessagesResponse>

}