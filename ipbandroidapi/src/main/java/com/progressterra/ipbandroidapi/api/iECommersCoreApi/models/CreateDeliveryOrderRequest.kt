package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models

import com.google.gson.annotations.SerializedName

internal class CreateDeliveryOrderRequest(
    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("calculatedPrice")
    val calculatedPrice: Double,
    @SerializedName("comment")
    val comment: String,
    @SerializedName("rfMethodType")
    val methodType: Int,
    @SerializedName("rfServiceType")
    val serviceType: Int,
    @SerializedName("rdPickUpPoint")
    val pickUpPoint: String? = null
)

enum class DeliveryServiceId(val id: String) {
    SDEK("a236b46f-2f54-4cb1-a119-484d11bb827d"),
    IML("706ab89f-e220-4c61-a8e9-d7178c422314"),
    PERSONAL("b2842d16-1780-4b21-bf9e-043ac525bab7")
}
