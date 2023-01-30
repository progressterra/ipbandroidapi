package com.progressterra.ipbandroidapi.api.product.models


import com.google.gson.annotations.SerializedName

/**
 * Данные цвета
 *
 * @param colorName Имя цвета1
 * @param hexCode 16-й код цвета
 * @param url ссылка на изображение цвета
 */

data class ColorData(

    /* Имя цвета1 */
    @SerializedName("colorName")
    val colorName: String? = null,

    /* 16-й код цвета */
    @SerializedName("hexCode")
    val hexCode: String? = null,

    /* ссылка на изображение цвета */
    @SerializedName("url")
    val url: String? = null

)

