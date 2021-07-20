package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.BonusesInfo
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class GeneralInfoResponse(
    @SerializedName("data")
    val `data`: Data? = null,
) : BaseResponse() {

    fun convertToBonusesInfo() =
        BonusesInfo(
            currentQuantity = data?.currentQuantity?.toInt() ?: 0,
            dateBurning = BonusesConverters.convertDate(data?.dateBurning),
            forBurningQuantity = data?.forBurningQuantity?.toInt() ?: 0,
            typeBonusName = data?.typeBonusName ?: ""
        )
}

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