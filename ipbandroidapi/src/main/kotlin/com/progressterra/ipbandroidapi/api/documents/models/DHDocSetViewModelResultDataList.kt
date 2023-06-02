package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class DHDocSetViewModelResultDataList(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<DHDocSetViewModel>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)
