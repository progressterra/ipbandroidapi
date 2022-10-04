package com.progressterra.ipbandroidapi.api.ibonus.model

data class GeneralBonusData(
    val currentQuantity: Double,
    val dateBurning: String,
    val forBurningQuantity: Double,
    val typeBonusName: String
) {

    internal constructor(data: GeneralBonusResponse.Data) : this(
        data.currentQuantity,
        data.dateBurning,
        data.forBurningQuantity,
        data.typeBonusName ?: ""
    )
}