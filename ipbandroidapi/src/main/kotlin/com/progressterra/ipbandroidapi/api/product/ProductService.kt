package com.progressterra.ipbandroidapi.api.product

import org.openapitools.client.models.FilterAndSort
import org.openapitools.client.models.ProductViewResultDataList
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ProductService {

    @POST("/product/list")
    suspend fun productList(@Body filterAndSort: FilterAndSort): ProductViewResultDataList

    @GET("/product/{idRFNomenclature}")
    suspend fun productByNomenclatureId(@Query("idRFNomenclature") id: String): ProductViewResultDataList

    
}
