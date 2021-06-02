package com.progressterra.ipbandroidapi.interfaces.client.bonuses.models

data class BonusMessage(
    val currentQuantity: Int,
    val dateBurning: String,
    val forBurningQuantity: Int,
    val typeBonusName: String
)