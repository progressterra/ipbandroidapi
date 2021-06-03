package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.BonusMessage
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal data class BonusesMessagesResponse(
    @SerializedName("dataList")
    val dataList: List<Data>
) : BaseResponse() {
    data class Data(
        @SerializedName("currentQuantity")
        val currentQuantity: Double? = null,
        @SerializedName("dateBurning")
        val dateBurning: String? = null,
        @SerializedName("forBurningQuantity")
        val forBurningQuantity: Double? = null,
        @SerializedName("typeBonusName")
        val typeBonusName: String? = null
    )

    fun convertToBonusMessagesList(bonusMessagesResponse: BonusesMessagesResponse?): MutableList<BonusMessage> {
        val convertedBonusMessages = mutableListOf<BonusMessage>()
        bonusMessagesResponse?.dataList?.map {
            convertedBonusMessages.add(
                BonusMessage(
                    currentQuantity = it.currentQuantity?.toInt() ?: 0,
                    dateBurning = BonusesConverters.convertDate(it.dateBurning),
                    forBurningQuantity = it.forBurningQuantity?.toInt() ?: 0,
                    typeBonusName = it.typeBonusName ?: ""
                )
            )
        }
        return convertedBonusMessages
    }
}