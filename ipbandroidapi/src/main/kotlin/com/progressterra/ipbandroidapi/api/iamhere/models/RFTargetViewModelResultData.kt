package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class RFTargetViewModelResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RFTargetViewModel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

