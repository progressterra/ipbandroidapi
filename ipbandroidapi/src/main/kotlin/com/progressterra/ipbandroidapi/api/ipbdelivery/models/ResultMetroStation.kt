package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * Станции метро.
 *
 * @param result 
 * @param dataList Список станций метро.
 */
data class ResultMetroStation (

    @SerializedName("result")
    val result: ResultOperation? = null,

    /* Список станций метро. */
    @SerializedName("dataList")
    val dataList: List<MetroStation>? = null
)