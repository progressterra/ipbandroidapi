package com.progressterra.ipbandroidapi.api.checklist.model

import java.util.*

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
internal data class ResultOperation(

    val status: StatusResult?,
    val message: String?,
    val messageDev: String?,
    val codeResult: Int?,
    val duration: Double?,
    val idLog: UUID?,
    val xRequestId: String?
)