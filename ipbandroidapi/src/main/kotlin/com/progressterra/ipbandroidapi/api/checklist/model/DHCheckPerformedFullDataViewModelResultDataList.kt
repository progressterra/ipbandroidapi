package com.progressterra.ipbandroidapi.api.checklist.model

/**
 * 
 * @param result 
 * @param dataList 
 * @param totalNumberRecords 
 */
data class DHCheckPerformedFullDataViewModelResultDataList (

    val result: ResultOperation?,
    val dataList: List<DHCheckPerformedFullDataViewModel>?,
    val totalNumberRecords: Int?
)