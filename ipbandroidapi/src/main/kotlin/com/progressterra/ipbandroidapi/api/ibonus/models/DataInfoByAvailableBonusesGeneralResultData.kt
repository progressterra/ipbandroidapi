package com.progressterra.ipbandroidapi.api.ibonus.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data
 * @param totalNumberRecords 
 */
data class DataInfoByAvailableBonusesGeneralResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DataInfoByAvailableBonusesGeneral? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)