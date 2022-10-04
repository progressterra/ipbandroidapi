package com.progressterra.ipbandroidapi.api.ibonus.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.BaseResult

internal data class GeneralBonusResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: Data,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
) {

    data class Data(
        @SerializedName("currentQuantity")
        val currentQuantity: Double,
        @SerializedName("dateBurning")
        val dateBurning: String,
        @SerializedName("forBurningQuantity")
        val forBurningQuantity: Double,
        @SerializedName("typeBonusName")
        val typeBonusName: String?
    )
}

