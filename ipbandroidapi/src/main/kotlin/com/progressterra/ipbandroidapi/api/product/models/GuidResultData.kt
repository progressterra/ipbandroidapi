package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 */

data class GuidResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: String? = null

)

