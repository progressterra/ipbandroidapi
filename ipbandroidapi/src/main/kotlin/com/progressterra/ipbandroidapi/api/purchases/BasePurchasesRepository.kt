package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseDetailsResponse
import com.progressterra.ipbandroidapi.api.purchases.model.PurchasesListResponse
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BasePurchasesRepository(
    handleException: HandleException,
    private val service: PurchasesService
) : PurchasesRepository, AbstractRepository(handleException) {

    override suspend fun getShopList(accessToken: String): Result<List<PurchasesListResponse.Data>?> =
        handle { service.getShopList(accessToken).listdata }

    override suspend fun getPurchaseDetails(purchaseId: String): Result<PurchaseDetailsResponse.Data?> =
        handle { service.getPurchaseDetails(purchaseId).data }
}