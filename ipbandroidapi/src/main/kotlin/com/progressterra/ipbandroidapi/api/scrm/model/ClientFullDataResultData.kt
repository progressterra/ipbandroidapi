package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

data class ClientFullDataResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: ClientFullData? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)

