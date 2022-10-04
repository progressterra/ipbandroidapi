package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
internal data class RFCheckViewModelResultDataList(

    val result: ResultOperation?,
    val dataList: List<RFCheckViewModel>?,
    val totalNumberRecords: Int?
)