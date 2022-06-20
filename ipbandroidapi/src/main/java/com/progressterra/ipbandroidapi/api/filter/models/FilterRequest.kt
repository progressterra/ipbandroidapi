package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName

data class FilterRequest(
    @SerializedName("idCategory")
    val idCategory: String,
    @SerializedName("filterAndSortData")
    val filterAndSortData: IncomeFilterAndSortData
)