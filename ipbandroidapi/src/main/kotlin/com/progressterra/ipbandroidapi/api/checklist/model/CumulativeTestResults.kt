package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param idrgTest
 * @param rgTest
 * @param descriptionResult
 * @param sumResult
 * @param listResultByParameter
 */
internal data class CumulativeTestResults(

    val idrgTest: java.util.UUID?,
    val rgTest: DHCheckPerformed?,
    val descriptionResult: String?,
    val sumResult: Double?,
    val listResultByParameter: List<CumulativeTestResultsByParameter>?
)