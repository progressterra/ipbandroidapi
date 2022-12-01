package com.progressterra.ipbandroidapi.api.message.models

import com.google.gson.annotations.SerializedName
import org.openapitools.client.models.ResultOperation

/**
 * 
 *
 * @param result 
 * @param dataList 
 * @param countPage 
 */
data class ResultListMessages (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<RGMessages>? = null,

    @SerializedName("countPage")
    val countPage: Int? = null
)