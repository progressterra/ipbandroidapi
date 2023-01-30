package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

data class StringResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: String? = null
)