package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.models.RGGoodsInventoryExt

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

