package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

class CreateDeliveryOrderRequest(
    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("calculatedPrice")
    val calculatedPrice: Double,
    @SerializedName("comment")
    val comment: String,
    @SerializedName("methodType")
    val methodType: Int,
    @SerializedName("serviceType")
    val serviceType: Int,
    @SerializedName("pickUpPoint")
    val pickUpPoint: String? = null
)

