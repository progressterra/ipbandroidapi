package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models

import com.google.gson.annotations.SerializedName

internal class CreateDeliveryOrderRequest(
    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("calculatedPrice")
    val calculatedPrice: Double,
    @SerializedName("rfMethodType")
    val rfMethodType: Int,
    @SerializedName("rfServiceType")
    val rfServiceType: Int,
    @SerializedName("rdPickUpPoint")
    val rdPickUpPoint: String? = null
)
