package com.progressterra.ipbandroidapi.api.legacyscrm.model

import com.google.gson.annotations.SerializedName

data class IncomeChannelData (

    @SerializedName("channelType")
    val channelType: Int? = null,

    @SerializedName("channelData")
    val channelData: String? = null
)

