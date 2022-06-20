package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName

data class SortData(
    @SerializedName("fieldName")
    val fieldName: String?,
    @SerializedName("variantSort")
    val typeVariationSort: String

)