package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.scrm.models.responses.PurchasesListResponse

interface PurchasesRepository {

    suspend fun getShopList(accessToken: String): PurchasesListResponse

    class Base(
        private val cloudDataSource: PurchasesCloudDataSource
    ) : PurchasesRepository {

        override suspend fun getShopList(accessToken: String): PurchasesListResponse = cloudDataSource.getShopList(accessToken)
    }
}