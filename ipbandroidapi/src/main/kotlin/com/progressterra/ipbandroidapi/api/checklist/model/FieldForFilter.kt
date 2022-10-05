package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param fieldName
 * @param listValue
 * @param comparisonType
 */
data class FieldForFilter(

    val fieldName: String?, val listValue: List<String>?, val comparisonType: TypeComparison?
)