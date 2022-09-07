package com.progressterra.ipbandroidapi.api.purchases.model

/**
 * Data model
 */
data class PurchaseData(
    val addedBonusesSum: Int,
    val purchaseDate: String,
    val purchaseId: String,
    val purchaseSum: Int,
    val shopName: String,
    val spentBonusesSum: Double
) {

    constructor(data: PurchasesListResponse.Data) : this(
        data.addedBonusesSum ?: 0,
        data.purchaseDate ?: "",
        data.purchaseId ?: "",
        data.purchaseSum ?: 0,
        data.shopName ?: "",
        data.spentBonusesSum ?: 0.0
    )
}