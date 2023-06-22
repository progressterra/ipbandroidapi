package com.progressterra.ipbandroidapi.api.balance

import com.progressterra.ipbandroidapi.api.balance.models.RGMoveDataEntityAmount
import com.progressterra.ipbandroidapi.api.balance.models.RGMoveDataEntityBase
import com.progressterra.ipbandroidapi.api.balance.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface BalanceRepository {

    suspend fun client(accessToken: String): Result<RGMoveDataEntityAmount?>

    suspend fun balance(
        accessToken: String, income: RGMoveDataEntityBase
    ): Result<RGMoveDataEntityAmount?>

    class Base(
        handleException: HandleException, private val service: BalanceService
    ) : AbstractRepository(handleException), BalanceRepository {

        override suspend fun client(accessToken: String): Result<RGMoveDataEntityAmount?> = handle {
            val response = service.client(accessToken)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun balance(
            accessToken: String, income: RGMoveDataEntityBase
        ): Result<RGMoveDataEntityAmount?> = handle {
            val response = service.balance(accessToken, income)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }
    }
}