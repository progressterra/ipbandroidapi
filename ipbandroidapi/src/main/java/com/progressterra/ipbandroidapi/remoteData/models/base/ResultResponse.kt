package com.progressterra.ipbandroidapi.remoteData.models.base

import com.google.gson.annotations.SerializedName

internal data class ResultResponse(
    @SerializedName("status")
    val status: Int? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("messageDev")
    val messageDev: String? = null,
    @SerializedName("codeResult")
    val codeResult: Int? = null,
    @SerializedName("duration")
    val duration: Int? = null,
    @SerializedName("idLog")
    val idLog: String? = null
) : BaseResponse()