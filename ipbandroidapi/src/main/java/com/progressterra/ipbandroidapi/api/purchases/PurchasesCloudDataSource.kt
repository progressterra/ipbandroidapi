package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.remotedata.CloudDataSource

interface PurchasesCloudDataSource {

    suspend fun getShopList(accessToken: String): PurchasesListResponse

    class Base(
        private val service: PurchasesService,
        handleException: HandleException
    ) : CloudDataSource.Abstract(handleException), PurchasesCloudDataSource {

        override suspend fun getShopList(accessToken: String): PurchasesListResponse = handle {
            service.getShopList(accessToken)
        }
    }
}