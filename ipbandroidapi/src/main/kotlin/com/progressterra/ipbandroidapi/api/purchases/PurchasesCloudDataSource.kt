package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseDetailsResponse
import com.progressterra.ipbandroidapi.api.purchases.model.PurchasesListResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource

internal interface PurchasesCloudDataSource {

    suspend fun getShopList(accessToken: String): PurchasesListResponse

    suspend fun getPurchaseDetails(purchaseId: String): PurchaseDetailsResponse

    class Base(
        private val service: PurchasesService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), PurchasesCloudDataSource {

        override suspend fun getShopList(accessToken: String): PurchasesListResponse = handle {
            service.getShopList(accessToken)
        }

        override suspend fun getPurchaseDetails(purchaseId: String): PurchaseDetailsResponse = handle {
            service.getPurchaseDetails(purchaseId)
        }
    }
}