package com.progressterra.ipbandroidapi.api.ipbmediadata.models


import com.google.gson.annotations.SerializedName

/**
 * Тип размера
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
    LARGE;
}

