package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

data class SortData(

    @SerializedName("fieldName")
    val fieldName: String? = null,

    @SerializedName("variantSort")
    val variantSort: TypeVariantSort? = null
)