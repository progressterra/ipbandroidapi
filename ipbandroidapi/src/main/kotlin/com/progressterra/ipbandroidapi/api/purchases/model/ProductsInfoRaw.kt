package com.progressterra.ipbandroidapi.api.purchases.model

import com.google.gson.annotations.SerializedName

internal data class ProductsInfoRaw(
    @SerializedName("addedBonusesSum")
    val addedBonusesSum: Double?,
    @SerializedName("beginPrice")
    val beginPrice: Double?,
    @SerializedName("price")
    val price: Double?,
    @SerializedName("productId")
    val productId: String?,
    @SerializedName("productImageDataJson")
    val productImageDataJson: String?,
    @SerializedName("productName")
    val productName: String?,
    @SerializedName("spentBonusesSum")
    val spentBonusesSum: Int?
)