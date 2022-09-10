package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseData

interface PurchasesRepository {

    suspend fun getShopList(accessToken: String): Result<List<PurchaseData>>
}