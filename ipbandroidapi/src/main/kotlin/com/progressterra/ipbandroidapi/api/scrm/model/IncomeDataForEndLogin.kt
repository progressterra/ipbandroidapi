package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

data class IncomeDataForEndLogin (

    @SerializedName("channelType")
    val channelType: Int? = null,

    @SerializedName("channelData")
    val channelData: String? = null,

    @SerializedName("codeConfirm")
    val codeConfirm: String? = null,

    @SerializedName("infoDevice")
    val infoDevice: String? = null
)

