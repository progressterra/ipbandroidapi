package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class DRCheckListItemForDHPerformedViewModelResultDataList(

    val result: ResultOperation?,
    val dataList: List<DRCheckListItemForDHPerformedViewModel>?,
    val totalNumberRecords: Int?
)