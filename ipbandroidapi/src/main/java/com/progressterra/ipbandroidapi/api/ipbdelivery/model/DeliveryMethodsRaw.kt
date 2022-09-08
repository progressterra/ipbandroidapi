package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

data class DeliveryMethodsRaw(
    @SerializedName("dhPickupPointInfo")
    val dhPickupPointInfo: DhPickupPointRaw? = null,
    @SerializedName("rdDeliveryTime")
    val rdDeliveryTime: String? = null,
    @SerializedName("rdDestinationPoint")
    val rdDestinationPoint: String? = null,
    @SerializedName("rdPrice")
    val rdPrice: Double? = null,
    @SerializedName("rfDeliveryType")
    val rfDeliveryType: String? = null
)