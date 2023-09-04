package com.progressterra.ipbandroidapi.api.legacyscrm.model

import com.google.gson.annotations.SerializedName

data class StringResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: String? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)

