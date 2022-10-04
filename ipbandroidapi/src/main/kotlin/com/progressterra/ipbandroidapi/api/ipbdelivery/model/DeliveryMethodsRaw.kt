package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

internal data class DeliveryMethodsRaw(
    @SerializedName("dhPickupPointInfo")
    val dhPickupPointInfo: DhPickupPointRaw?,
    @SerializedName("rdDeliveryTime")
    val rdDeliveryTime: String?,
    @SerializedName("rdDestinationPoint")
    val rdDestinationPoint: String?,
    @SerializedName("rdPrice")
    val rdPrice: Double?,
    @SerializedName("rfDeliveryType")
    val rfDeliveryType: String?
)