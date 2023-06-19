package com.progressterra.ipbandroidapi.api.cart.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 * @param totalNumberRecords
 */
data class DHSaleHeadAsOrderViewModelResultDataList(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<DHSaleHeadAsOrderViewModel>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

