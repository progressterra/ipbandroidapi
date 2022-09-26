package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

internal data class VerificationStartRequest(
    @SerializedName("channelType") val channelType: Int,
    @SerializedName("channelData") val channelData: String?
)
