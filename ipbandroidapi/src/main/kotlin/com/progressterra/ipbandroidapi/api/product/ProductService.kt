package com.progressterra.ipbandroidapi.api.product

import com.progressterra.ipbandroidapi.api.product.models.ColorDataResultDataList
import com.progressterra.ipbandroidapi.api.product.models.ExtDataListRGGoodsInventoryResultData
import com.progressterra.ipbandroidapi.api.product.models.FiltersGoodsResultData
import com.progressterra.ipbandroidapi.api.product.models.GuidResultData
import com.progressterra.ipbandroidapi.api.product.models.IncomeDataForFilterAndSort
import com.progressterra.ipbandroidapi.api.product.models.StringResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ProductService {

    @GET("/product/list/color")
    suspend fun colorsForItem(@Query("idRGGoodsInventory") id: String): ColorDataResultDataList

    @GET("/product/sizetable")
    suspend fun sizeTableForItem(@Query("idRGGoodsInventory") id: String): StringResultData

    @POST("/product/byfilter")
    suspend fun itemsFiltered(@Body request: IncomeDataForFilterAndSort): ExtDataListRGGoodsInventoryResultData

    @GET("/product/bycolor")
    suspend fun itemByColor(@Query("idRGGoodsInventory") id: String, @Query("colorName") colorName: String): GuidResultData

    @GET("/product/filterdata")
    suspend fun filterData(@Query("idCategory") id: String): FiltersGoodsResultData
}