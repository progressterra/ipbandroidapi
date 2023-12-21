package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class RGClientChannelResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGClientChannel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

