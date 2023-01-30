package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 */

data class ExtDataListRGGoodsInventoryResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: ExtDataListRGGoodsInventory? = null

)

