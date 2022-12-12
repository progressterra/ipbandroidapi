package com.progressterra.ipbandroidapi.api.message.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 */
data class ResultDialogList(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RGDialogs>? = null
)