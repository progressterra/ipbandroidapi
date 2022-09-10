package com.progressterra.ipbandroidapi.base

import com.google.gson.annotations.SerializedName

internal data class ResultResponse(

    @SerializedName("messageDev")
    val messageDev: String? = null,
    @SerializedName("codeResult")
    val codeResult: Int? = null,
    @SerializedName("idLog")
    val idLog: String? = null
) : BaseResponse()