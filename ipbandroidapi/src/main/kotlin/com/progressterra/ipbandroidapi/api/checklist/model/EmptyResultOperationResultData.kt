package com.progressterra.ipbandroidapi.api.checklist.model

/**
 * 
 * @param result 
 * @param data
 * @param totalNumberRecords 
 */
data class EmptyResultOperationResultData (

    val result: ResultOperation? = null,
    val data: EmptyResultOperation? = null,
    val totalNumberRecords: Int? = null
)