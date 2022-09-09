package com.progressterra.ipbandroidapi.api.moneyout

import com.progressterra.ipbandroidapi.api.moneyout.model.ApplicationData
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesData

interface MoneyOutRepository {

    suspend fun removeBonuses(
        accessToken: String,
        outType: Int,
        sum: Int
    ): Result<RemoveBonusesData>

    suspend fun getConfirmedApplications(accessToken: String): Result<List<ApplicationData>>

    suspend fun getNotConfirmedApplications(accessToken: String): Result<List<ApplicationData>>
}