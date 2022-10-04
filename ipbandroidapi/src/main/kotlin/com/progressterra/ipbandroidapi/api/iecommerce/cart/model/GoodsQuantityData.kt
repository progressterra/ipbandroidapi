package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

data class GoodsQuantityData(
    val count: Int,
    val idrgGoodsInventory: String
) {

    internal constructor(data: GoodsQuantityResponse.Data?) : this(
        data?.count ?: 0,
        data?.idrgGoodsInventory ?: ""
    )
}
