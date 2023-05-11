package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName

data class SortData(

    @SerializedName("fieldName") val fieldName: String? = null,

    @SerializedName("variantSort") val variantSort: String? = null
)
