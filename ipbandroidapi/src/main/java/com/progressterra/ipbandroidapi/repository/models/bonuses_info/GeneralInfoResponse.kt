package com.progressterra.ipbandroidapi.repository.models.bonuses_info


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.repository.models.base.BaseResponse

data class GeneralInfoResponse(
    @SerializedName("data")
    val `data`: Data,
) : BaseResponse()

data class Data(
    @SerializedName("currentQuantity")
    val currentQuantity: Double,
    @SerializedName("dateBurning")
    val dateBurning: String,
    @SerializedName("forBurningQuantity")
    val forBurningQuantity: Double,
    @SerializedName("typeBonusName")
    val typeBonusName: String
)