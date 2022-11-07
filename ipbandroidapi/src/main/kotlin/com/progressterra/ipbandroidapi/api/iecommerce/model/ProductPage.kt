package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.models.RGGoodsInventoryExt

/**
 *
 *
 * @param countItemsInPage
 * @param totalPage
 * @param numberCurrentPage
 * @param allQuantityItemsProducts
 * @param listProducts
 */

data class ProductPage(

    @SerializedName("countItemsInPage")
    val countItemsInPage: Int? = null,

    @SerializedName("totalPage")
    val totalPage: Int? = null,

    @SerializedName("numberCurrentPage")
    val numberCurrentPage: Int? = null,

    @SerializedName("allQuantityItemsProducts")
    val allQuantityItemsProducts: Int? = null,

    @SerializedName("listProducts")
    val listProducts: List<RGGoodsInventoryExt>? = null

)

