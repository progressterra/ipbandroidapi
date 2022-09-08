package com.progressterra.ipbandroidapi.api.moneyout

import com.progressterra.ipbandroidapi.api.moneyout.model.ApplicationsResponse
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesRequest
import com.progressterra.ipbandroidapi.api.moneyout.model.RemoveBonusesResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

interface MoneyOutCloudDataSource {

    suspend fun removeBonuses(removeBonusesRequest: RemoveBonusesRequest): RemoveBonusesResponse

    suspend fun getConfirmedApplications(accessToken: String): ApplicationsResponse

    suspend fun getNotConfirmedApplications(accessToken: String): ApplicationsResponse

    class Base(
        private val service: MoneyOutService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), MoneyOutCloudDataSource {

        override suspend fun removeBonuses(removeBonusesRequest: RemoveBonusesRequest): RemoveBonusesResponse =
            handle {
                service.removeBonuses(removeBonusesRequest)
            }

        override suspend fun getConfirmedApplications(accessToken: String): ApplicationsResponse =
            handle {
                service.getConfirmedApplications(accessToken)
            }

        override suspend fun getNotConfirmedApplications(accessToken: String): ApplicationsResponse =
            handle {
                service.getNotConfirmedApplications(accessToken)
            }
    }
}