package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 * Значенния фильтров для товара
 *
 * @param color
 * @param collection
 * @param typeOfGoods
 * @param sizeOfGoods
 */
data class FiltersGoods(
    @SerializedName("color")
    val color: List<ColorData>? = null,
    @SerializedName("collection")
    val collection: List<String>? = null,
    @SerializedName("typeOfGoods")
    val typeOfGoods: List<String>? = null,
    @SerializedName("sizeOfGoods")
    val sizeOfGoods: List<String>? = null
)