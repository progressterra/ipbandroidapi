package com.progressterra.ipbandroidapi.interfaces.client.bonuses.models

data class BonusesInfo(
    val currentQuantity: Int,
    val dateBurning: String,
    val forBurningQuantity: Int,
    val typeBonusName: String,
    var showAllBonusesInfo: Boolean = currentQuantity != 0
)