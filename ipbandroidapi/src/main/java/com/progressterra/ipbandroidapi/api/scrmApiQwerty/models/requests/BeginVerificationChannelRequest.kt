package com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests

import com.google.gson.annotations.SerializedName

data class BeginVerificationChannelRequest(
    @SerializedName("channelName") val channelName: String,
    @SerializedName("channelValue") val channelValue: String
)