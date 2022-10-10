package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param status
 * @param message
 * @param messageDev
 * @param codeResult
 * @param duration
 * @param idLog
 * @param xRequestId
 */
data class ResultOperation(

    val status: Int?,
    val message: String?,
    val messageDev: String?,
    val codeResult: Int?,
    val duration: Double?,
    val idLog: String?,
    val xRequestId: String?
)