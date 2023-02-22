package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param listFields
 * @param sort
 * @param skip
 * @param take
 * @param searchData
 */
data class FilterAndSort(
    val listFields: List<FieldForFilter>?,
    val sort: SortData?,
    val searchData: String?,
    val skip: Int?,
    val take: Int?
)