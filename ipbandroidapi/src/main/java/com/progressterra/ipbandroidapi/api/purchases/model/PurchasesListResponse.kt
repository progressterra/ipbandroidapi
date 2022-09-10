package com.progressterra.ipbandroidapi.api.purchases.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class PurchasesListResponse(
    @SerializedName("listdata")
    val listdata: List<Data>
) : BaseResponse() {

    data class Data(
        @SerializedName("addedBonusesSum")
        val addedBonusesSum: Int? = null,
        @SerializedName("purchaseDate")
        val purchaseDate: String? = null,
        @SerializedName("purchaseId")
        val purchaseId: String? = null,
        @SerializedName("purchaseSum")
        val purchaseSum: Int? = null,
        @SerializedName("shopName")
        val shopName: String? = null,
        @SerializedName("spentBonusesSum")
        val spentBonusesSum: Double? = null
    )
}