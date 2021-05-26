package com.progressterra.ipbandroidapi.remoteData.models.base

import com.google.gson.annotations.SerializedName

data class ResultResponse(
    @SerializedName("status")
    val status: Int? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("messageDev")
    val messageDev: String? = null,
    @SerializedName("codeResult")
    val codeResult: Int? = null,
    @SerializedName("idLog")
    val idLog: String? = null
) : BaseResponse()