package com.progressterra.ipbandroidapi.api.iProBonusApi

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchasesResponse
import retrofit2.http.GET
import retrofit2.http.Path

internal interface IProBonusApi {

    /**
     * Получение списка покупок
     */
    @GET("/api/v1/clientpurchase/{AccessToken}")
    suspend fun getPurchasesList(@Path("AccessToken") accessToken: String): PurchasesResponse

    /**
     * Отображение детальной информации о покупке клиента
     */
    @GET("/api/v1/clientpurchase/info/{purchaseId}")
    suspend fun getPurchaseDetailInfo(@Path("purchaseId") purchaseId: String): PurchaseDetailInfoResponse

}