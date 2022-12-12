package com.progressterra.ipbandroidapi.api.message.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 */
data class ResultDialog(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGDialogs? = null
)