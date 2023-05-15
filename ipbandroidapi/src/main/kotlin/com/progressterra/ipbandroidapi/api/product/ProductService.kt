package com.progressterra.ipbandroidapi.api.product

import com.progressterra.ipbandroidapi.api.product.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.product.models.ProductViewResultData
import com.progressterra.ipbandroidapi.api.product.models.ProductViewResultDataList
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ProductService {

    @POST("/product/list")
    suspend fun productList(
        @Header("AccessToken") accessToken: String,
        @Body filterAndSort: FilterAndSort
    ): ProductViewResultDataList

    @GET("/product/{idRFNomenclature}")
    suspend fun productByNomenclatureId(
        @Header("AccessToken") accessToken: String,
        @Path("idRFNomenclature") id: String
    ): ProductViewResultData

    @GET("/product/rggoodsinventory/{idrgGoodsInventory}")
    suspend fun productByGoodsInventoryId(
        @Header("AccessToken") accessToken: String,
        @Path("idrgGoodsInventory") id: String
    ): ProductViewResultData
}
