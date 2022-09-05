package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchasesListResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource

interface PurchasesCloudDataSource {

    suspend fun getShopList(accessToken: String): PurchasesListResponse

    class Base(
        private val service: PurchasesService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), PurchasesCloudDataSource {

        override suspend fun getShopList(accessToken: String): PurchasesListResponse = handle {
            service.getShopList(accessToken)
        }
    }
}