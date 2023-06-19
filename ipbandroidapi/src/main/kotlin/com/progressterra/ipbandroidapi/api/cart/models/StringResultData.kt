package com.progressterra.ipbandroidapi.api.cart.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class StringResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: String? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

