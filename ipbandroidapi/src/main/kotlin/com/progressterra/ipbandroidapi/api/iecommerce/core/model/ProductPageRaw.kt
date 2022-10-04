package com.progressterra.ipbandroidapi.api.iecommerce.core.model

import com.google.gson.annotations.SerializedName

internal data class ProductPageRaw(
    @SerializedName("countItemsInPage") val countItemsInPage: Int?,
    @SerializedName("totalPage") val totalPage: Int?,
    @SerializedName("numberCurrentPage") val numberCurrentPage: Int?,
    @SerializedName("allQuantityItemsProducts") val allQuantityItemsProducts: Int?,
    @SerializedName("listProducts") val listProducts: List<RGGoodsInventoryExtRaw>?
)