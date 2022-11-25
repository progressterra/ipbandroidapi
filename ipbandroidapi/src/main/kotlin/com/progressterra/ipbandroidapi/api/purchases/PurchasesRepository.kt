package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.purchases.model.PurchaseDetailsResponse
import com.progressterra.ipbandroidapi.api.purchases.model.PurchasesListResponse

interface PurchasesRepository {

    suspend fun getShopList(accessToken: String): Result<List<PurchasesListResponse.Data>?>

    suspend fun getPurchaseDetails(purchaseId: String): Result<PurchaseDetailsResponse.Data?>
}