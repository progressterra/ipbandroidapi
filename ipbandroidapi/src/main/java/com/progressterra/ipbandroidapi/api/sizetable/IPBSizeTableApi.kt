package com.progressterra.ipbandroidapi.api.sizetable

import com.progressterra.ipbandroidapi.api.sizetable.models.SizeTableResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IPBSizeTableApi {

    @GET("/product/sizetable")
    suspend fun getSizeTable(
        @Query("idRGGoodsInventory") idRGGoodsInventory: String
    ): SizeTableResponse
}