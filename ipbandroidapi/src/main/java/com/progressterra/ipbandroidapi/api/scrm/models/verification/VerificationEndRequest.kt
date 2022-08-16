package com.progressterra.ipbandroidapi.api.scrm.models.verification

import com.google.gson.annotations.SerializedName

data class VerificationEndRequest(
    @SerializedName("channelType") val channelType: Int,
    @SerializedName("channelData") val channelData: String,
    @SerializedName("codeConfirm") val codeConfirm: String,
    @SerializedName("infoDevice") val infoDevice: String
)
