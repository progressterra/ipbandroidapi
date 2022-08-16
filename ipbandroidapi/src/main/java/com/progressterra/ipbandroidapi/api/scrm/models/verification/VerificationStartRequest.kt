package com.progressterra.ipbandroidapi.api.scrm.models.verification

import com.google.gson.annotations.SerializedName

data class VerificationStartRequest(
    //TODO enum
    @SerializedName("channelType") val channelType: Int,
    @SerializedName("channelData") val channelData: String
)
