package com.progressterra.ipbandroidapi.api.cart.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class DHSaleHeadAsOrderViewModelResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DHSaleHeadAsOrderViewModel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

