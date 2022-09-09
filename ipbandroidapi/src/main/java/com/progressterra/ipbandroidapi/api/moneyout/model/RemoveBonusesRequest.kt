package com.progressterra.ipbandroidapi.api.moneyout.model

import com.google.gson.annotations.SerializedName

internal data class RemoveBonusesRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("outType")
    val outType: Int,
    @SerializedName("sum")
    val sum: Int
)