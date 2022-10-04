package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
internal data class RFCheckResultDataList(

    val result: ResultOperation?,
    val dataList: List<RFCheck>?,
    val totalNumberRecords: Int?
)