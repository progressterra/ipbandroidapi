package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param dataList
 * @param listDataSets
 */

data class ProductSet(

    @SerializedName("dataList")
    val dataList: List<RGGoodsInventoryExt>? = null,

    @SerializedName("listDataSets")
    val listDataSets: List<SetData>? = null

)

