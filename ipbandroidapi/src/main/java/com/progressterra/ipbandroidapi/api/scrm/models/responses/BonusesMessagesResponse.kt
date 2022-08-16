package com.progressterra.ipbandroidapi.api.scrm.models.responses


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.BonusMessage

internal data class BonusesMessagesResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("dataList") val dataList: List<Data>,
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

    fun convertToBonusMessagesList(bonusMessagesResponse: BonusesMessagesResponse?): List<BonusMessage> {
        return buildList {
            bonusMessagesResponse?.dataList?.map {
                add(
                    BonusMessage(
                        currentQuantity = it.currentQuantity.toInt(),
                        dateBurning = BonusesConverters.convertDate(it.dateBurning),
                        forBurningQuantity = it.forBurningQuantity.toInt(),
                        typeBonusName = it.typeBonusName ?: ""
                    )
                )
            }
        }
    }
}