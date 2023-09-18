package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

data class RGDeviceTokenEntity(
    @SerializedName("osType")
    val osType: OsType? = null,
    @SerializedName("tokenData")
    val tokenData: String? = null
)

