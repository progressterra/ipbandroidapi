package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
internal data class ComPlaceWithDataResultDataList(

    val result: ResultOperation?,
    val dataList: List<ComPlaceWithData>?,
    val totalNumberRecords: Int?
)