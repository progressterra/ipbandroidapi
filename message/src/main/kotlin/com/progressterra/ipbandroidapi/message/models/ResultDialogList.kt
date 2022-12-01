package com.progressterra.ipbandroidapi.message.models

import com.google.gson.annotations.SerializedName
import org.openapitools.client.models.ResultOperation

/**
 * 
 *
 * @param result 
 * @param dataList 
 */
data class ResultDialogList (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RGDialogs>? = null
)