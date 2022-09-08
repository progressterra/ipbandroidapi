package com.progressterra.ipbandroidapi.api.moneyout

import com.progressterra.ipbandroidapi.api.moneyout.model.ApplicationData
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesData
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

interface MoneyOutRepository {

    suspend fun removeBonuses(
        accessToken: String,
        outType: Int,
        sum: Int
    ): Result<RemoveBonusesData>

    suspend fun getConfirmedApplications(accessToken: String): Result<List<ApplicationData>>

    suspend fun getNotConfirmedApplications(accessToken: String): Result<List<ApplicationData>>

    class Base(
        private val cloudDataSource: MoneyOutCloudDataSource
    ) : AbstractRepository(), MoneyOutRepository {

        override suspend fun removeBonuses(
            accessToken: String,
            outType: Int,
            sum: Int
        ): Result<RemoveBonusesData> =
            handle {
                val response = cloudDataSource.removeBonuses(
                    RemoveBonusesRequest(
                        accessToken, outType, sum
                    )
                )
                if (response.status != 0)
                    throw BadRequestException()
                response
            }.map { RemoveBonusesData(it.data) }

        override suspend fun getConfirmedApplications(accessToken: String): Result<List<ApplicationData>> = handle {
            val response = cloudDataSource.getConfirmedApplications(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { data -> data.dataList?.map { ApplicationData(it) } ?: emptyList() }

        override suspend fun getNotConfirmedApplications(accessToken: String): Result<List<ApplicationData>> = handle {
            val response = cloudDataSource.getNotConfirmedApplications(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { data -> data.dataList?.map { ApplicationData(it) } ?: emptyList() }
    }
}