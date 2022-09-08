package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

data class DeliveryRaw(
    @SerializedName("deliveryMethodsList")
    val deliveryMethodsList: List<DeliveryMethodsRaw>? = null,
    @SerializedName("deliveryServiceName")
    val deliveryServiceName: String? = null
)