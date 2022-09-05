package com.progressterra.ipbandroidapi.api.purchases.model

/**
* Data model
 */
data class PurchaseInfo(
    val addedBonusesSum: Int,
    val purchaseDate: String,
    val purchaseId: String,
    val purchaseSum: Int,
    val shopName: String,
    val spentBonusesSum: Double
)