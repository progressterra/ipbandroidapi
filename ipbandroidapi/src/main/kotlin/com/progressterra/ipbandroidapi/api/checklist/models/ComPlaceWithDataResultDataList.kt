package com.progressterra.ipbandroidapi.api.checklist.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param dataList 
 * @param totalNumberRecords 
 */


data class ComPlaceWithDataResultDataList (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<ComPlaceWithData>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

