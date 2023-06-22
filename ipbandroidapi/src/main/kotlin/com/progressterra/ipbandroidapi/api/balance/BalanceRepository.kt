package com.progressterra.ipbandroidapi.api.balance

import com.progressterra.ipbandroidapi.api.balance.models.RGMoveDataEntityAmount
import com.progressterra.ipbandroidapi.api.balance.models.RGMoveDataEntityBase
import com.progressterra.ipbandroidapi.api.balance.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface BalanceRepository {

    suspend fun client(): Result<RGMoveDataEntityAmount?>

    suspend fun balance(income: RGMoveDataEntityBase): Result<RGMoveDataEntityAmount?>

    class Base(
        handleException: HandleException,
        private val service: BalanceService
    ) : AbstractRepository(handleException), BalanceRepository {

        override suspend fun client(): Result<RGMoveDataEntityAmount?> = handle {
            val response = service.client()
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun balance(income: RGMoveDataEntityBase): Result<RGMoveDataEntityAmount?> = handle {
            val response = service.balance(income)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }
    }
}