package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.model.BonusData
import com.progressterra.ipbandroidapi.api.ibonus.model.GeneralBonusData
import com.progressterra.ipbandroidapi.api.ibonus.model.TransactionData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseIBonusRepository(
    handleException: HandleException,
    private val service: IBonusService
) : IBonusRepository, AbstractRepository(handleException) {

    override suspend fun getGeneralInfo(accessToken: String): Result<GeneralBonusData> = handle {
        val response = service.getGeneralInfo(accessToken)
        if (response.result.status != 0)
            throw BadRequestException()
        response
    }.map { GeneralBonusData(it.data) }

    override suspend fun getTransactionsList(accessToken: String): Result<List<TransactionData>> =
        handle {
            val response = service.getTransactionsList(accessToken)
            if (response.result.status != 0)
                throw BadRequestException()
            response
        }.map { response -> response.dataList.map { TransactionData(it) } }

    override suspend fun getBonusMessagesList(accessToken: String): Result<List<BonusData>> =
        handle {
            val response = service.getBonusMessagesList(accessToken)
            if (response.result.status != 0)
                throw BadRequestException()
            response
        }.map { response -> response.dataList.map { BonusData(it) } }
}