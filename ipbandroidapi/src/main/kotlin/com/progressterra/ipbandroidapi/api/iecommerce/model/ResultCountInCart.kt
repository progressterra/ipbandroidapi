package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 */

data class ResultCountInCart(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DataRowInCart? = null

)

