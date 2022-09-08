package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName

data class RemoveBonusesRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("outType")
    val outType: Int,
    @SerializedName("sum")
    val sum: Int
)