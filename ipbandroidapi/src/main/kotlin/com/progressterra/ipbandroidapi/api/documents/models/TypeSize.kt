package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 * Тип размера
 *
 * Values: original,small,medium,large
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
