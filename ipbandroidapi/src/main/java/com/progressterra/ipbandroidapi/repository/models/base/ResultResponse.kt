package com.progressterra.ipbandroidapi.repository.models.base

import com.google.gson.annotations.SerializedName

data class ResultResponse(
    @SerializedName("codeResult")
    val codeResult: Int? = null,
    @SerializedName("duration")
    val duration: Double? = null,
    @SerializedName("idLog")
    val idLog: String? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("messageDev")
    val messageDev: Any? = null,
    @SerializedName("status")
    val status: Int? = null
)