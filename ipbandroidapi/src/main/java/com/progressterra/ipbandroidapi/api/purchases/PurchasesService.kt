package com.progressterra.ipbandroidapi.api.purchases

import com.progressterra.ipbandroidapi.api.scrm.models.responses.PurchasesListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PurchasesService {

    @GET("/api/v1/clientpurchase/{AccessToken}")
    suspend fun getShopList(@Path("AccessToken") accessToken: String): PurchasesListResponse
}