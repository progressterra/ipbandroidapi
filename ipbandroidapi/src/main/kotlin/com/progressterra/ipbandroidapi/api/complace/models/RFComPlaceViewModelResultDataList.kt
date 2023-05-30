package com.progressterra.ipbandroidapi.api.complace.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class RFComPlaceViewModelResultDataList(

    @SerializedName("result") val result: ResultOperation? = null,

    @SerializedName("dataList") val dataList: List<RFComPlaceViewModel>? = null,

    @SerializedName("totalNumberRecords") val totalNumberRecords: Int? = null

)

