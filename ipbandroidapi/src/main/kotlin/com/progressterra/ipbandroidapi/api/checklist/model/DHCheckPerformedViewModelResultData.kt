package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
data class DHCheckPerformedViewModelResultData(

    val result: ResultOperation?,
    val data: DHCheckPerformedViewModel?,
    val totalNumberRecords: Int?
)