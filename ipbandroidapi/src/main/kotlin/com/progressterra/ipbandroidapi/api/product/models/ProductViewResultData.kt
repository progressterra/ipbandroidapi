package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
data class ProductViewResultData(

    @SerializedName("result") val result: ResultOperation? = null,

    @SerializedName("data") val data: ProductView? = null,

    @SerializedName("totalNumberRecords") val totalNumberRecords: Int? = null
)
