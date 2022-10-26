package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

data class IncomeDeviceParameters (

    @SerializedName("idDivice")
    val idDivice: String? = null,

    @SerializedName("deviceToken")
    val deviceToken: String? = null
)

