package com.progressterra.ipbandroidapi.api.checklist.model

import com.google.gson.annotations.SerializedName

/**
 *
 * Values: EQUALS_STRONG,EQUALS_IGNORE_CASE,CONTAINS_STRONG,CONTAINS_IGNORE_CASE
 */
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