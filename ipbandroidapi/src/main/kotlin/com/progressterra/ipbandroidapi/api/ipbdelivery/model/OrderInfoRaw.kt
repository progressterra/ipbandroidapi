package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

internal data class OrderInfoRaw(
    @SerializedName("error")
    val error: String?,
    @SerializedName("order")
    val order: OrderRaw?,
    @SerializedName("status")
    val status: String?
)