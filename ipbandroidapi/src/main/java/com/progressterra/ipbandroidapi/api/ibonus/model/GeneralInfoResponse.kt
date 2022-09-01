package com.progressterra.ipbandroidapi.api.ibonus.model


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.BonusesInfo

data class GeneralInfoResponse(
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
    fun convertToBonusesInfo() =
        BonusesInfo(
            currentQuantity = data.currentQuantity.toInt(),
            dateBurning = BonusesConverters.convertDate(data.dateBurning),
            forBurningQuantity = data.forBurningQuantity.toInt(),
            typeBonusName = data.typeBonusName ?: ""
        )
}

