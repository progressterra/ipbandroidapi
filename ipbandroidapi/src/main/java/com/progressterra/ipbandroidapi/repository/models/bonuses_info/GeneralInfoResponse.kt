package com.progressterra.ipbandroidapi.repository.models.bonuses_info


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.repository.models.base.BaseResponse

data class GeneralInfoResponse(
    @SerializedName("data")
    val `data`: Data? = null,
) : BaseResponse()

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