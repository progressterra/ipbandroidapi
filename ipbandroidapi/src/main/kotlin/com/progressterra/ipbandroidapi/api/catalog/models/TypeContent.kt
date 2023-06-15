package com.progressterra.ipbandroidapi.api.catalog.models


import com.google.gson.annotations.SerializedName

/**
 * 0 - image - изображение  1 - video - видео  2 - pdf - pdf документ  3 - html - это html страница со своим адресом  4 - htmlString - это форматированный текст html, который хранится в StringData  5 - stringData - строковое значение  6 - voiceData - голосовые данные
 *
 * Values: image,video,pdf,html,htmlString,stringData,voiceData
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
