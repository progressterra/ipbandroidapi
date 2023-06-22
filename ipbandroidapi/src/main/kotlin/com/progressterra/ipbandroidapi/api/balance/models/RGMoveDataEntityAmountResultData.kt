package com.progressterra.ipbandroidapi.api.balance.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class RGMoveDataEntityAmountResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGMoveDataEntityAmount? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

