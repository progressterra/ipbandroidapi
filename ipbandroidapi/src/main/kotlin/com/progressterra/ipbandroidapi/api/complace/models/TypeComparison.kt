package com.progressterra.ipbandroidapi.api.complace.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: equalsStrong,equalsIgnoreCase,containsStrong,containsIgnoreCase
 */
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
