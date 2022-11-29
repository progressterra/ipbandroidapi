package com.progressterra.ipbandroidapi.api.purchases.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

//TODO regenerate models

data class PurchasesListResponse(
    @SerializedName("listdata")
    val listdata: List<Data>,
) {

    data class Data(
        @SerializedName("addedBonusesSum")
        val addedBonusesSum: Int?,
        @SerializedName("purchaseDate")
        val purchaseDate: String?,
        @SerializedName("purchaseId")
        val purchaseId: String?,
        @SerializedName("purchaseSum")
        val purchaseSum: Int?,
        @SerializedName("shopName")
        val shopName: String?,
        @SerializedName("spentBonusesSum")
        val spentBonusesSum: Double?
    )
}