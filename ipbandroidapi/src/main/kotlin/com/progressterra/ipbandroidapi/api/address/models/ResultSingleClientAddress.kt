package com.progressterra.ipbandroidapi.api.address.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data
 */
data class ResultSingleClientAddress (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGAddress? = null
)