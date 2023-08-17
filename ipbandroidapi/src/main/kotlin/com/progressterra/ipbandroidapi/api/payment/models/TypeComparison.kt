package com.progressterra.ipbandroidapi.api.payment.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: EQUALS_STRONG,EQUALS_IGNORE_CASE,CONTAINS_STRONG,CONTAINS_IGNORE_CASE
 */

enum class TypeComparison {

    @SerializedName("equalsStrong")
    EQUALS_STRONG,

    @SerializedName("equalsIgnoreCase")
    EQUALS_IGNORE_CASE,

    @SerializedName("containsStrong")
    CONTAINS_STRONG,

    @SerializedName("containsIgnoreCase")
    CONTAINS_IGNORE_CASE;
}

