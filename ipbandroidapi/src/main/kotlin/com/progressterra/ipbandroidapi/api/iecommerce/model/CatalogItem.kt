package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param item
 * @param childItems
 * @param totalQuantity
 * @param tottalCount
 */
data class CatalogItem(

    @SerializedName("item")
    val item: RFCatalog? = null,

    @SerializedName("childItems")
    val childItems: List<CatalogItem>? = null,

    @SerializedName("totalQuantity")
    val totalQuantity: Int? = null,

    @SerializedName("tottalCount")
    val tottalCount: Int? = null

)