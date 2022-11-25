package com.progressterra.ipbandroidapi.base

import com.google.gson.annotations.SerializedName

open  class BaseResponse {
    @SerializedName("result", alternate = ["resultOperation"])
    val result: ResultResponse? = null

    @SerializedName("status")
    val status: Int? = null

    @SerializedName("message")
    val message: String? = null
}