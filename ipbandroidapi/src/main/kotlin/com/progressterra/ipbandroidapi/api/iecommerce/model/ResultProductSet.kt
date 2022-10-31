package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 */

data class ResultProductSet(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: ProductSet? = null

)

