package com.progressterra.ipbandroidapi.api.catalog.models


import com.google.gson.annotations.SerializedName

/**
 * Тип вывода категории каталога - широкий формат - на всю ширину экрана. Или по 2 на строку экрана
 *
 * Values: wideFormat,towInLine
 */

enum class TypeFormatViewProduct {

    @SerializedName("wideFormat")
    WIDE_FORMAT,

    @SerializedName("towInLine")
    TOW_IN_LINE
}
