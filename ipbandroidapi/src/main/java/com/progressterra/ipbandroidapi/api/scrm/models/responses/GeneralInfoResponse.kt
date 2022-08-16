package com.progressterra.ipbandroidapi.api.scrm.models.responses


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.BonusesInfo

data class GeneralInfoResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: GeneralInfoData,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
) {

    fun convertToBonusesInfo() =
        BonusesInfo(
            currentQuantity = data.currentQuantity.toInt(),
            dateBurning = BonusesConverters.convertDate(data.dateBurning),
            forBurningQuantity = data.forBurningQuantity.toInt(),
            typeBonusName = data.typeBonusName ?: ""
        )
}

data class GeneralInfoData(
    @SerializedName("currentQuantity")
    val currentQuantity: Double,
    @SerializedName("dateBurning")
    val dateBurning: String,
    @SerializedName("forBurningQuantity")
    val forBurningQuantity: Double,
    @SerializedName("typeBonusName")
    val typeBonusName: String?
)