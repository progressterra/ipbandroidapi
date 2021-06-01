package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

class PurchasesListResponse(
    @SerializedName("listdata")
    val listdata: List<Listdata>
) : BaseResponse()

data class Listdata(
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

