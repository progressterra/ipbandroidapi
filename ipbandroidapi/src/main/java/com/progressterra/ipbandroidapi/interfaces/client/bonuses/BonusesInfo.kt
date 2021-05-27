package com.progressterra.ipbandroidapi.interfaces.client.bonuses

data class BonusesInfo(
    val currentQuantity: Int,
    val dateBurning: String,
    val forBurningQuantity: String,
    val typeBonusName: String,
    var showAllBonusesInfo: Boolean = currentQuantity != 0
)