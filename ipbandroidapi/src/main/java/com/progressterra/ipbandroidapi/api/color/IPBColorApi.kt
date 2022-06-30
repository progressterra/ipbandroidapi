package com.progressterra.ipbandroidapi.api.color

import com.progressterra.ipbandroidapi.api.color.models.ColorResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IPBColorApi {

    @GET("/product/list/color")
    suspend fun getSizeTable(
        @Query("idRGGoodsInventory") idRGGoodsInventory: String
    ): ColorResponse
}