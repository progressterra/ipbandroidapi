package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName

data class FieldForFilter(

    @SerializedName("fieldName")
    val fieldName: String? = null,

    @SerializedName("listValue")
    val listValue: List<String>? = null,

    @SerializedName("comparison")
    val comparison: String? = null
)
