package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class GoodsQuantityResponse(
    @SerializedName("data") val data: GoodsQuantityData?=null
) : BaseResponse()

data class GoodsQuantityData(
    @SerializedName("count") val count: Int? = null,
    @SerializedName("idrgGoodsInventoty") val idrgGoodsInventory: String?=null
)