package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.model.*

interface IBonusRepository {

    suspend fun getGeneralInfo(accessToken: String): Result<GeneralBonusData>

    suspend fun getTransactionsList(accessToken: String): Result<List<TransactionData>>

    suspend fun getBonusMessagesList(accessToken: String): Result<List<BonusData>>
}