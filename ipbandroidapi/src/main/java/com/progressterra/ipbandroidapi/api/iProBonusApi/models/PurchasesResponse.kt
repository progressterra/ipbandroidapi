package com.progressterra.ipbandroidapi.api.iProBonusApi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

class PurchasesResponse(
    @SerializedName("listdata")
    val listdata: List<Listdata>
) : BaseResponse()

data class Listdata(
    @SerializedName("addedBonusesSum")
    val addedBonusesSum: Double? = null,
    @SerializedName("purchaseDate")
    val purchaseDate: String? = null,
    @SerializedName("purchaseId")
    val purchaseId: String? = null,
    @SerializedName("purchaseSum")
    val purchaseSum: Double? = null,
    @SerializedName("shopName")
    val shopName: String? = null,
    @SerializedName("spentBonusesSum")
    val spentBonusesSum: Double? = null
)