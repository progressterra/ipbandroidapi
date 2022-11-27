package com.progressterra.ipbandroidapi.api.address.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data
 */
data class ResultClientAddress (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DataAddress? = null
)