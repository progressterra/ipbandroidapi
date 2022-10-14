package com.progressterra.ipbandroidapi.api.checklist.model

data class DRCheckListItemViewModelResultDataList(
    val result: ResultOperation?,
    val dataList: List<DRCheckListItemViewModel>?,
    val totalNumberRecords: Int?
)
