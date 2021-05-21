package com.progressterra.ipbandroidapi.repository.models.base

import com.google.gson.annotations.SerializedName

data class ResultResponse(
    @SerializedName("codeResult")
    val codeResult: Int,
    @SerializedName("duration")
    val duration: Double,
    @SerializedName("idLog")
    val idLog: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("messageDev")
    val messageDev: Any,
    @SerializedName("status")
    val status: Int
)