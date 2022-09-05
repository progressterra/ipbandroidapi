package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class DeviceParameters(
    @SerializedName("idDivice") val idDevice: String,
    @SerializedName("deviceToken") val deviceToken: String
)