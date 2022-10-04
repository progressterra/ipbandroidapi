package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
internal data class DHCheckPerformedViewModelResultDataList(

    val result: ResultOperation?,
    val dataList: List<DHCheckPerformedViewModel>?,
    val totalNumberRecords: Int?
)