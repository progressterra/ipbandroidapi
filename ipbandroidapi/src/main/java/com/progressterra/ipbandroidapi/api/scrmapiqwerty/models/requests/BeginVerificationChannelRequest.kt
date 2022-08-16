package com.progressterra.ipbandroidapi.api.scrmapiqwerty.models.requests

import com.google.gson.annotations.SerializedName

data class BeginVerificationChannelRequest(
    @SerializedName("channelName") val channelName: String,
    @SerializedName("channelValue") val channelValue: String
)