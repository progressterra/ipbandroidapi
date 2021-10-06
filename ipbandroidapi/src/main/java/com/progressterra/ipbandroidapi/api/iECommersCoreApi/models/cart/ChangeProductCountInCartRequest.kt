package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart

import com.google.gson.annotations.SerializedName

data class ChangeProductCountInCartRequest(
    @SerializedName("idGoodsInventory") val idGoodsInventory: String,
    @SerializedName("count") val count: Int,
    @SerializedName("idSellerAmbassador") val idSellerAmbassador: String
)