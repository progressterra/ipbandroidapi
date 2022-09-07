package com.progressterra.ipbandroidapi.api.ibonus.model

/**
 * Data model
 */
data class GeneralBonusData(
    val currentQuantity: Double,
    val dateBurning: String,
    val forBurningQuantity: Double,
    val typeBonusName: String
) {

    constructor(data: GeneralBonusResponse.Data) : this(
        data.currentQuantity,
        data.dateBurning,
        data.forBurningQuantity,
        data.typeBonusName ?: ""
    )
}