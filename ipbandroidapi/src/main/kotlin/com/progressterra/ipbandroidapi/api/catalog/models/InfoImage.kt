package com.progressterra.ipbandroidapi.api.catalog.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param url 
 * @param sizeType 
 * @param width 
 * @param height 
 * @param propertySize 
 */


data class InfoImage (

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("sizeType")
    val sizeType: TypeSize? = null,

    @SerializedName("width")
    val width: Int? = null,

    @SerializedName("height")
    val height: Int? = null,

    @SerializedName("size")
    val propertySize: Long? = null

)

