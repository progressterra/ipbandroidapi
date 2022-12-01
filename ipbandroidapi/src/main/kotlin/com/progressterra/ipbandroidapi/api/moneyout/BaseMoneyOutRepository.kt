package com.progressterra.ipbandroidapi.api.moneyout

import com.progressterra.ipbandroidapi.api.moneyout.model.ApplicationData
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesData
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

internal class BaseMoneyOutRepository(
    handleException: HandleException,
    private val service: MoneyOutService
) : AbstractRepository(handleException), MoneyOutRepository {

    override suspend fun removeBonuses(
        accessToken: String,
        outType: Int,
        sum: Int
    ): Result<RemoveBonusesData> =
        handle {
            val response = service.removeBonuses(
                RemoveBonusesRequest(
                    accessToken, outType, sum
                )
            )
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { RemoveBonusesData(it.data) }

    override suspend fun getConfirmedApplications(accessToken: String): Result<List<ApplicationData>> = handle {
        val response = service.getConfirmedApplications(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { data -> data.dataList?.map { ApplicationData(it) } ?: emptyList() }

    override suspend fun getNotConfirmedApplications(accessToken: String): Result<List<ApplicationData>> = handle {
        val response = service.getNotConfirmedApplications(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { data -> data.dataList?.map { ApplicationData(it) } ?: emptyList() }
}