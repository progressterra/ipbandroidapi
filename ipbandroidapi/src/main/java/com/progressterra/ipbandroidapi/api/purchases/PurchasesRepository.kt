package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseData
import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseDetailsData

interface PurchasesRepository {

    suspend fun getShopList(accessToken: String): Result<List<PurchaseData>>

    suspend fun getPurchaseDetails(purchaseId: String): Result<PurchaseDetailsData>
}