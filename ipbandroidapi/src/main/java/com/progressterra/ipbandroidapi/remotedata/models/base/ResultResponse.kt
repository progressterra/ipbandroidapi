package com.progressterra.ipbandroidapi.remotedata.models.base

import com.google.gson.annotations.SerializedName

data class ResultResponse(

    @SerializedName("messageDev")
    val messageDev: String? = null,
    @SerializedName("codeResult")
    val codeResult: Int? = null,
    @SerializedName("idLog")
    val idLog: String? = null
) : BaseResponse()