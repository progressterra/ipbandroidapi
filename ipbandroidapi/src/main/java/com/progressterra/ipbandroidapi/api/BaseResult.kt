package com.progressterra.ipbandroidapi.api

import com.google.gson.annotations.SerializedName

internal data class BaseResult(
    @SerializedName("status") val status: Int,
    @SerializedName("message") val message: String?,
    @SerializedName("messageDev") val messageDev: String?,
    @SerializedName("codeResult") val codeResult: Int,
    @SerializedName("duration") val duration: Double,
    @SerializedName("idLog") val idLog: String
)
