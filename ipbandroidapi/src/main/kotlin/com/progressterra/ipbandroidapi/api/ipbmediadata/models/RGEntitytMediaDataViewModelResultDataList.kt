package com.progressterra.ipbandroidapi.api.ipbmediadata.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param dataList 
 * @param totalNumberRecords 
 */


data class RGEntitytMediaDataViewModelResultDataList (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RGEntitytMediaDataViewModel>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

