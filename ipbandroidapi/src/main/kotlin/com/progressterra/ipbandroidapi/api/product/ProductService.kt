package com.progressterra.ipbandroidapi.api.product

import com.progressterra.ipbandroidapi.api.product.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.product.models.ProductViewResultDataList
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface ProductService {

    @POST("/product/list")
    suspend fun productList(
        @Header("AccessToken") accessToken: String,
        @Body filterAndSort: FilterAndSort
    ): ProductViewResultDataList

    @GET("/product/{idRFNomenclature}")
    suspend fun productByNomenclatureId(
        @Header("AccessToken") accessToken: String,
        @Query("idRFNomenclature") id: String
    ): ProductViewResultDataList

    @GET("/product/rggoodsinventory/{idrgGoodsInventory}")
    suspend fun productByGoodsInventoryId(
        @Header("AccessToken") accessToken: String,
        @Query("idrgGoodsInventory") id: String
    ): ProductViewResultDataList
}
