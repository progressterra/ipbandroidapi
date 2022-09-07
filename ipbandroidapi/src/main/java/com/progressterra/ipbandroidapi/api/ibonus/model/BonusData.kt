package com.progressterra.ipbandroidapi.api.ibonus.model

/**
 * Data model
 */
data class BonusData(
    val currentQuantity: Double,
    val dateBurning: String,
    val forBurningQuantity: Double,
    val typeBonusName: String
) {

    constructor(data: BonusesMessagesResponse.Data) : this(
        data.currentQuantity,
        data.dateBurning,
        data.forBurningQuantity,
        data.typeBonusName ?: ""
    )
}
