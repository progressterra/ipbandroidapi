package com.progressterra.ipbandroidapi.api.iamhere.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * Values: IMAGE,VIDEO,PDF,HTML,HTML_STRING,STRING_DATA,VOICE_DATA
 */

enum class TypeContent {

    @SerializedName("image")
    IMAGE,

    @SerializedName("video")
    VIDEO,

    @SerializedName("pdf")
    PDF,

    @SerializedName("html")
    HTML,

    @SerializedName("htmlString")
    HTML_STRING,

    @SerializedName("stringData")
    STRING_DATA,

    @SerializedName("voiceData")
    VOICE_DATA
}

