package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
internal data class DRCheckListItemForDHPerformedViewModelResultData(

    val result: ResultOperation?,
    val data: DRCheckListItemForDHPerformedViewModel?,
    val totalNumberRecords: Int?
)