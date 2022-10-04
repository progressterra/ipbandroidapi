package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
internal data class RFCheckResultData(

    val result: ResultOperation?,
    val data: RFCheck?,
    val totalNumberRecords: Int?
)