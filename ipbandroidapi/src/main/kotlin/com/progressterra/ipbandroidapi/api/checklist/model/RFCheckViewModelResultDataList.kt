package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class RFCheckViewModelResultDataList(

    val result: ResultOperation?,
    val dataList: List<RFCheckViewModel>?,
    val totalNumberRecords: Int?
)