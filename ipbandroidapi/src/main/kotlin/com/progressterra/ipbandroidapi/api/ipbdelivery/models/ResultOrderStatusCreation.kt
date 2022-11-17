package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 */
data class ResultOrderStatusCreation(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DeliveryResponse? = null
)