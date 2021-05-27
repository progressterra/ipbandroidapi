package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

class ShopListResponse(
    @SerializedName("data")
    val data: ShopListData,
) : BaseResponse()

data class ShopListProductsInfo(
    @SerializedName("addedBonusesSum")
    val addedBonusesSum: Int,
    @SerializedName("beginPrice")
    val beginPrice: Double,
    @SerializedName("price")
    val price: Double,
    @SerializedName("productId")
    val productId: String,
    @SerializedName("productImageDataJson")
    val productImageDataJson: Any,
    @SerializedName("productName")
    val productName: Any,
    @SerializedName("spentBonusesSum")
    val spentBonusesSum: Double
)

data class ShopListData(
    @SerializedName("productsInfo")
    val productsInfo: List<ShopListProductsInfo>,
    @SerializedName("purchaseDate")
    val purchaseDate: String,
    @SerializedName("purchaseId")
    val purchaseId: String,
    @SerializedName("purchaseSum")
    val purchaseSum: Int,
    @SerializedName("shopName")
    val shopName: String
)