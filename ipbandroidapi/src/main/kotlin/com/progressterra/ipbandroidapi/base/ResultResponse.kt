package com.progressterra.ipbandroidapi.base

import com.google.gson.annotations.SerializedName

data class ResultResponse(

    @SerializedName("messageDev")
    val messageDev: String?,
    @SerializedName("codeResult")
    val codeResult: Int?,
    @SerializedName("idLog")
    val idLog: String?
) : BaseResponse()