package com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models


import com.google.gson.annotations.SerializedName

data class PurchaseDetailInfoResponse(
    @SerializedName("data")
    val data: Data? = null
)

data class Data(
    @SerializedName("productsInfo")
    val productsInfo: List<ProductsInfo>? = null,
    @SerializedName("purchaseDate")
    val purchaseDate: String? = null,
    @SerializedName("purchaseId")
    val purchaseId: String? = null,
    @SerializedName("purchaseSum")
    val purchaseSum: Int? = null,
    @SerializedName("shopName")
    val shopName: String? = null
)

data class ProductsInfo(
    @SerializedName("addedBonusesSum")
    val addedBonusesSum: Double? = null,
    @SerializedName("beginPrice")
    val beginPrice: Double? = null,
    @SerializedName("price")
    val price: Double? = null,
    @SerializedName("productId")
    val productId: String? = null,
    @SerializedName("productImageDataJson")
    val productImageDataJson: String? = null,
    @SerializedName("productName")
    val productName: String? = null,
    @SerializedName("spentBonusesSum")
    val spentBonusesSum: Int? = null
)
