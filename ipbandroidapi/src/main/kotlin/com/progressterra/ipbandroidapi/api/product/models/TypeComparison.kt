package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

@Suppress("unused")
enum class TypeComparison {

    @SerializedName("equalsStrong")
    EQUALS_STRONG,

    @SerializedName("equalsIgnoreCase")
    EQUALS_IGNORE_CASE,

    @SerializedName("containsStrong")
    CONTAINS_STRONG,

    @SerializedName("containsIgnoreCase")
    CONTAINS_IGNORE_CASE
}