package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BasePurchasesRepository(
    private val cloudDataSource: PurchasesCloudDataSource
) : PurchasesRepository, AbstractRepository() {

    override suspend fun getShopList(accessToken: String): Result<List<PurchaseData>> =
        handle {
            val response = cloudDataSource.getShopList(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { purchasesListResponse ->
            purchasesListResponse.listdata.map {
                PurchaseData(it)
            }
        }
}