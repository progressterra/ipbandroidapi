package com.progressterra.ipbandroidapi.api.purchases.model

import com.google.gson.annotations.SerializedName

data class PurchaseDetailsResponse(
    @SerializedName("data")
    val data: Data?
) {

    data class Data(
        @SerializedName("productsInfo")
        val productsInfo: List<ProductsInfo>?,
        @SerializedName("purchaseDate")
        val purchaseDate: String?,
        @SerializedName("purchaseId")
        val purchaseId: String?,
        @SerializedName("purchaseSum")
        val purchaseSum: Int?,
        @SerializedName("shopName")
        val shopName: String?,
        @SerializedName("number")
        val number: String?,
        @SerializedName("adressString")
        val address: String?
    )
}

