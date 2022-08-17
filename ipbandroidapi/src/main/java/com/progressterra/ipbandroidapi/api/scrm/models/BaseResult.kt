package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

data class BaseResult(
    @SerializedName("status") val status: Int,
    @SerializedName("message") val message: String?,
    @SerializedName("messageDev") val messageDev: String?,
    @SerializedName("codeResult") val codeResult: Int,
    @SerializedName("duration") val duration: Int,
    @SerializedName("idLog") val idLog: String
)
