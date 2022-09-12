package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class GoodsQuantityResponse(
    @SerializedName("data") val data: Data?=null
) : BaseResponse() {

    data class Data(
        @SerializedName("count") val count: Int?,
        @SerializedName("idrgGoodsInventoty") val idrgGoodsInventory: String?=null
    )
}