package com.progressterra.ipbandroidapi.remoteData.models.base

import com.google.gson.annotations.SerializedName

open class BaseResponse {
    @SerializedName("result", alternate = ["resultOperation"])
    val result: ResultResponse? = null

    @SerializedName("status")
    val statusBody: Int? = null

    @SerializedName("message")
    val messageBody: String? = null
}