package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
internal data class CumulativeTestResultsResultDataList(

    val result: ResultOperation?,
    val dataList: List<CumulativeTestResults>?,
    val totalNumberRecords: Int?
)