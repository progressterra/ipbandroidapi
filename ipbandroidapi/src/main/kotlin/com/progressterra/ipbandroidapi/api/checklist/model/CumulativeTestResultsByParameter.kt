package com.progressterra.ipbandroidapi.api.checklist.model

import java.util.*

/**
 *
 * @param idrf_umulativeTestParameters
 * @param valueParameter
 * @param indexName
 * @param descriptionResult
 * @param sumResult
 */
internal data class CumulativeTestResultsByParameter(

    val idrf_umulativeTestParameters: UUID?,
    val valueParameter: String?,
    val indexName: String?,
    val descriptionResult: String?,
    val sumResult: Double?
)