package com.progressterra.ipbandroidapi.api.checklist.model

import java.util.*

/**
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
internal data class GuidResultData(

    val result: ResultOperation?,
    val data: UUID?,
    val totalNumberRecords: Int?
)