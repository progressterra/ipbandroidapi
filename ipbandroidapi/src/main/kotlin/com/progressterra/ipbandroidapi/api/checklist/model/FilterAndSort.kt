package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param listFields
 * @param sort
 * @param searchString
 * @param shownotmarkedasdeleted
 * @param skip
 * @param take
 */
data class FilterAndSort(

    val listFields: List<FieldForFilter>?,
    val sort: SortData?,
    val searchString: String?,
    val shownotmarkedasdeleted: Boolean?,
    val skip: Int?,
    val take: Int?
)