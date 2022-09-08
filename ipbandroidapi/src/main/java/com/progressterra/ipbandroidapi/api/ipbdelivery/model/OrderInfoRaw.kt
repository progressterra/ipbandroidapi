package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

data class OrderInfoRaw(
    @SerializedName("error")
    val error: String? = null,
    @SerializedName("order")
    val order: OrderRaw? = null,
    @SerializedName("status")
    val status: String? = null
)