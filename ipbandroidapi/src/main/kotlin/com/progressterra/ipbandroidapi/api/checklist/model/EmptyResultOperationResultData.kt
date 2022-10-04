package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
internal data class EmptyResultOperationResultData(

    val result: ResultOperation?, val data: EmptyResultOperation?, val totalNumberRecords: Int?
)