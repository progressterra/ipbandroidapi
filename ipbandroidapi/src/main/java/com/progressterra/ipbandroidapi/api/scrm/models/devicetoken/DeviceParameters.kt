package com.progressterra.ipbandroidapi.api.scrm.models.devicetoken

import com.google.gson.annotations.SerializedName

data class DeviceParameters(
    @SerializedName("idDivice") val idDevice: String,
    @SerializedName("deviceToken") val deviceToken: String
)