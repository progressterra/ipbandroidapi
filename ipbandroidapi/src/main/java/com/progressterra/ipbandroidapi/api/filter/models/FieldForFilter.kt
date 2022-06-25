package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName

data class FieldForFilter(
    @SerializedName("fieldName")
    val fieldName: String?,
    @SerializedName("comparisonType")
    val comparisonType: String?,
    @SerializedName("listValue")
    val listValue: List<String?>?
)