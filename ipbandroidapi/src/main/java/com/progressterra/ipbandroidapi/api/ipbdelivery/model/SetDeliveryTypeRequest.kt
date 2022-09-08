package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

data class SetDeliveryTypeRequest(
    @SerializedName("rfMethodType")
    val rfMethodType: Int,
    @SerializedName("rfServiceType")
    val rfServiceType: Int,
    @SerializedName("rdPickUpPoint")
    val rdPickUpPoint: String? = null
)