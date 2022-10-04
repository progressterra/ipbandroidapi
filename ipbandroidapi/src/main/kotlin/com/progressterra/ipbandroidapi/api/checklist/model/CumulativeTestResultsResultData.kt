package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
internal data class CumulativeTestResultsResultData(

    val result: ResultOperation?,
    val data: CumulativeTestResults?,
    val totalNumberRecords: kotlin.Int?
)