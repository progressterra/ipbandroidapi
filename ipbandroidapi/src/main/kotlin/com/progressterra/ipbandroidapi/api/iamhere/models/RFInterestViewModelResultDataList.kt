package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param dataList 
 * @param totalNumberRecords 
 */


data class RFInterestViewModelResultDataList (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RFInterestViewModel>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

