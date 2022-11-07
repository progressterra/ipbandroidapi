package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseData
import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseDetailsData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BasePurchasesRepository(
    handleException: HandleException,
    private val service: PurchasesService
) : PurchasesRepository, AbstractRepository(handleException) {

    override suspend fun getShopList(accessToken: String): Result<List<PurchaseData>> =
        handle {
            val response = service.getShopList(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { purchasesListResponse ->
            purchasesListResponse.listdata.map {
                PurchaseData(it)
            }
        }

    override suspend fun getPurchaseDetails(purchaseId: String): Result<PurchaseDetailsData> = handle {
        service.getPurchaseDetails(purchaseId)
    }.map {
        PurchaseDetailsData(it.data)
    }
}