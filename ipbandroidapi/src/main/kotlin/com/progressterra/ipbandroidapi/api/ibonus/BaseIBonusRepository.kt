package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.models.BonusTransaction
import com.progressterra.ipbandroidapi.api.ibonus.models.DataInfoByAvailableBonusesGeneral
import com.progressterra.ipbandroidapi.api.ibonus.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseIBonusRepository(
    handleException: HandleException,
    private val service: IBonusService
) : IBonusRepository, AbstractRepository(handleException) {

    override suspend fun getGeneralInfo(accessToken: String): Result<DataInfoByAvailableBonusesGeneral?> =
        handle {
            val response = service.getGeneralInfo(accessToken)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }

    override suspend fun getTransactionsList(accessToken: String): Result<List<BonusTransaction>?> =
        handle {
            val response = service.getTransactionsList(accessToken)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }
}