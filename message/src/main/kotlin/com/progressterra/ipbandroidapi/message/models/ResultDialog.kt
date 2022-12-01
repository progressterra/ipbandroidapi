package com.progressterra.ipbandroidapi.message.models

import com.google.gson.annotations.SerializedName
import org.openapitools.client.models.ResultOperation

/**
 * 
 *
 * @param result 
 * @param data
 */
data class ResultDialog (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGDialogs? = null
)