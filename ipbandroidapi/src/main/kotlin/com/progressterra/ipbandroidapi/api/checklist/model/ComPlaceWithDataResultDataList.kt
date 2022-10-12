package com.progressterra.ipbandroidapi.api.checklist.model

import com.google.gson.annotations.SerializedName

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class ComPlaceWithDataResultDataList(

    @SerializedName("result") val result: ResultOperation?,
    @SerializedName("dataList") val dataList: List<ComPlaceWithData>?,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int?
)