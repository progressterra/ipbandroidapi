package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
internal data class RFCumulativeTestQuestionResultDataList(

    val result: ResultOperation? = null,
    val dataList: List<RFCumulativeTestQuestion>? = null,
    val totalNumberRecords: Int? = null
)