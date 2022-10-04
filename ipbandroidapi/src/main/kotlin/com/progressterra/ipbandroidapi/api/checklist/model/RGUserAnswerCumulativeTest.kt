package com.progressterra.ipbandroidapi.api.checklist.model

import java.time.LocalDateTime
import java.util.*

/**
 *
 * @param idUnique
 * @param idrgUserCumulativeTest
 * @param idrfCumulativeTestQuestion
 * @param dateEvent
 * @param indexAnswer
 * @param valueAnswer
 */
internal data class RGUserAnswerCumulativeTest(

    val idUnique: UUID? = null,
    val idrgUserCumulativeTest: UUID? = null,
    val idrfCumulativeTestQuestion: UUID? = null,
    val dateEvent: LocalDateTime? = null,
    val indexAnswer: Int? = null,
    val valueAnswer: Double? = null
)