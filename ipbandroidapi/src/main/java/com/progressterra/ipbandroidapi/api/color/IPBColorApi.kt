package com.progressterra.ipbandroidapi.api.color

import com.progressterra.ipbandroidapi.api.color.models.ColorResponse
import com.progressterra.ipbandroidapi.api.color.models.ColoredResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IPBColorApi {

    @GET("/product/list/color")
    suspend fun getColors(
        @Query("idRGGoodsInventory") idRGGoodsInventory: String
    ): ColorResponse

    @GET("/product/bycolor")
    suspend fun getIdByColor(
        @Query("idRGGoodsInventory") idRGGoodsInventory: String,
        @Query("colorName") colorName: String
    ): ColoredResponse
}