package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class ChangeProductCountInCartRequest(
    @SerializedName("idGoodsInventory") val idGoodsInventory: String,
    @SerializedName("count") val count: Int,
    @SerializedName("idSellerAmbassador") val idSellerAmbassador: String
)