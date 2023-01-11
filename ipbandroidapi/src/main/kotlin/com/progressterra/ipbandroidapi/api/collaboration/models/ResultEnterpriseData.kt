package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName


data class ResultEnterpriseData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGEnterpriseData? = null
)