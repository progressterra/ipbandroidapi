package com.progressterra.ipbandroidapi.api.messenger.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: ORIGINAL,SMALL,MEDIUM,LARGE
 */

enum class TypeSize {

    @SerializedName("original")
    ORIGINAL,

    @SerializedName("small")
    SMALL,

    @SerializedName("medium")
    MEDIUM,

    @SerializedName("large")
    LARGE
}

