package com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.cart

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class GoodsQuantityResponse(
    @SerializedName("data") val data: GoodsQuantityData?=null
) : BaseResponse()

data class GoodsQuantityData(
    @SerializedName("count") val count: Int? = null,
    @SerializedName("idrgGoodsInventoty") val idrgGoodsInventory: String?=null
)