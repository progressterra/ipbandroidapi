package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param fieldName
 * @param variantSort
 */
data class SortData(
    @SerializedName("fieldName")
    val fieldName: String? = null,
    @SerializedName("variantSort")
    val variantSort: String? = null
)