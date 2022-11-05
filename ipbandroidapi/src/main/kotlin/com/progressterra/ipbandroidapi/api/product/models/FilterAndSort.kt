package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param listFields
 * @param sort
 * @param searchString
 * @param shownotmarkedasdeleted
 */
data class FilterAndSort(
    @SerializedName("listFields")
    val listFields: List<FieldForFilter>? = null,
    @SerializedName("sort")
    val sort: SortData? = null,
    @SerializedName("searchString")
    val searchString: String? = null,
    @SerializedName("shownotmarkedasdeleted")
    val shownotmarkedasdeleted: Boolean? = null
)