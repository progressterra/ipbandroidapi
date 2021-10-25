package com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery

import com.google.gson.annotations.SerializedName

data class SetDeliveryTypeRequest(
    @SerializedName("rfMethodType")
    val rfMethodType: Int,
    @SerializedName("rfServiceType")
    val rfServiceType: Int,
    @SerializedName("rdPickUpPoint")
    val rdPickUpPoint: String? = null
)