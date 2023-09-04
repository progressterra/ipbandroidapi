package com.progressterra.ipbandroidapi.api.auth.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class DeviceDataResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DeviceData? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

