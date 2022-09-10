package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

internal data class DeliveryRaw(
    @SerializedName("deliveryMethodsList")
    val deliveryMethodsList: List<DeliveryMethodsRaw>?,
    @SerializedName("deliveryServiceName")
    val deliveryServiceName: String?
)