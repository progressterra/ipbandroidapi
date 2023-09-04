package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param dataList 
 * @param totalNumberRecords 
 */


data class RGAddressResultDataList (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RGAddress>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

