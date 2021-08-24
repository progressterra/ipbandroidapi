package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi

import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ProductPageResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IECommersCoreApi {

    /**
     * Получаем список продуктов по списку идентификаторов RGGoodsInventory
     */
    @POST("/iecommercecore/api/v1/products/bylistid/{AccessToken}")
    suspend fun getProductsByIds(
        @Path("AccessToken") accessToken: String,
        @Body idsList: List<String>
    ): ProductPageResponse
}