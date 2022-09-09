package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class GoodsQuantityResponse(
    @SerializedName("data") val data: GoodsQuantityData?=null
) : BaseResponse() {

    data class GoodsQuantityData(
        @SerializedName("count") val count: Int? = null,
        @SerializedName("idrgGoodsInventoty") val idrgGoodsInventory: String?=null
    )
}