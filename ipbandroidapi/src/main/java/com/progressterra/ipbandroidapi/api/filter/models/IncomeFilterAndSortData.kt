package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName

data class IncomeFilterAndSortData(
    @SerializedName("shownotmarkedasdeleted")
    val showNotMarkedAsDeleted : Boolean?,
    @SerializedName("searchString")
    val searchString: String?,
    @SerializedName("listFields")
    val listFields: List<FieldForFilter>,
    @SerializedName("sort")
    val sortData: SortData
)