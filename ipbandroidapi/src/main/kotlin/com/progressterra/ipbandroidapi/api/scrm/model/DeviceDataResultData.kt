package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

data class DeviceDataResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DeviceData? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)

