package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseInfo
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface PurchasesRepository {

    suspend fun getShopList(accessToken: String): Result<List<PurchaseInfo>>

    class Base(
        private val cloudDataSource: PurchasesCloudDataSource
    ) : PurchasesRepository, AbstractRepository() {

        override suspend fun getShopList(accessToken: String): Result<List<PurchaseInfo>> =
            handle {
                cloudDataSource.getShopList(accessToken)
            }.map {
                purchasesListResponse -> purchasesListResponse.listdata.map {
                    it.toPurchase()
                }
            }
    }
}