package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * Values: notFill,waitImage,waitReview,rejected,confirmed
 */
enum class TypeStatusDoc {

    @SerializedName("notFill")
    NOT_FILL,

    @SerializedName("waitImage")
    WAIT_IMAGE,

    @SerializedName("waitReview")
    WAIT_REVIEW,

    @SerializedName("rejected")
    REJECTED,

    @SerializedName("confirmed")
    CONFIRMED
}
