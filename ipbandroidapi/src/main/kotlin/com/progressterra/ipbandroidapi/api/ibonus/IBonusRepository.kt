package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.models.BonusTransaction
import com.progressterra.ipbandroidapi.api.ibonus.models.DataInfoByAvailableBonusesGeneral

interface IBonusRepository {

    suspend fun getGeneralInfo(accessToken: String): Result<DataInfoByAvailableBonusesGeneral?>

    suspend fun getTransactionsList(accessToken: String): Result<List<BonusTransaction>?>
}