package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class RFCharacteristicValueViewModelResultDataList(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RFCharacteristicValueViewModel>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)

