package com.progressterra.ipbandroidapi.api.documents.models

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
    val variantSort: TypeVariantSort? = null
)
