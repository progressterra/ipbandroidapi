package com.progressterra.ipbandroidapi.api.messenger.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param dataList 
 * @param totalNumberRecords 
 */


data class RGMessagesViewModelResultDataList (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RGMessagesViewModel>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

