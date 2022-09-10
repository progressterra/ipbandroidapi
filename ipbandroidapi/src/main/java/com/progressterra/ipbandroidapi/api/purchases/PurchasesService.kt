package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.messages.model.PurchaseDetailsResponse
import com.progressterra.ipbandroidapi.api.purchases.model.PurchasesListResponse
import retrofit2.http.GET
import retrofit2.http.Path

internal interface PurchasesService {

    @GET("/api/v1/clientpurchase/{AccessToken}")
    suspend fun getShopList(@Path("AccessToken") accessToken: String): PurchasesListResponse

    @GET("/api/v1/clientpurchase/info/{purchaseId}")
    suspend fun getPurchaseDetails(@Path("purchaseId") purchaseId: String): PurchaseDetailsResponse
}