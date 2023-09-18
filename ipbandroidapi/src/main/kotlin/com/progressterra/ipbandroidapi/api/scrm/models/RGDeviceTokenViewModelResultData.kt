package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */


data class RGDeviceTokenViewModelResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGDeviceTokenViewModel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

