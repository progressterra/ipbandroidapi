package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.GeneralInfoResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.TransactionListResponse

interface BonusesRepository {

    suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse>
    suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse>
    suspend fun getTransactionsList(accessToken: String):ResponseWrapper<TransactionListResponse>
    suspend fun getPurchasesList(accessToken: String):ResponseWrapper<PurchasesListResponse>

}