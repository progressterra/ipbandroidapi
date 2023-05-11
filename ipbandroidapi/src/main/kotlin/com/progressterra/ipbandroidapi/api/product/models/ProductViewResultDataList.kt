package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class ProductViewResultDataList(

    @SerializedName("result") val result: ResultOperation? = null,

    @SerializedName("dataList") val dataList: List<ProductView>? = null,

    @SerializedName("totalNumberRecords") val totalNumberRecords: Int? = null
)
