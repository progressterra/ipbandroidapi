package com.progressterra.ipbandroidapi.api.legacyscrm.model

import com.google.gson.annotations.SerializedName

data class EmptyResultOperationResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)

