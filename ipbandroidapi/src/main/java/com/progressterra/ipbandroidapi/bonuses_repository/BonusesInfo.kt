package com.progressterra.ipbandroidapi.bonuses_repository

data class BonusesInfo(
    val currentQuantity: String,
    val dateBurning: String,
    val forBurningQuantity: String,
    val typeBonusName: String,
    var showAllBonusesInfo: Boolean = currentQuantity != "0"
)