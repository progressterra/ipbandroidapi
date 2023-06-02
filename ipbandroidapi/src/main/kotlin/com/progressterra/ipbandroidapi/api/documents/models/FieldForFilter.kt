package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param fieldName
 * @param listValue
 * @param comparison
 */
data class FieldForFilter(

    @SerializedName("fieldName")
    val fieldName: String? = null,

    @SerializedName("listValue")
    val listValue: List<String>? = null,

    @SerializedName("comparison")
    val comparison: TypeComparison? = null

)
