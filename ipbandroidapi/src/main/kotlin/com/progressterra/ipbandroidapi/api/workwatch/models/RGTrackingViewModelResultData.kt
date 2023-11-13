package com.progressterra.ipbandroidapi.api.workwatch.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class RGTrackingViewModelResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGTrackingViewModel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

