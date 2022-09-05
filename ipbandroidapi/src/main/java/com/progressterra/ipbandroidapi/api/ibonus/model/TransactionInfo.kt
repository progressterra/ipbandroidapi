package com.progressterra.ipbandroidapi.api.ibonus.model

/**
* Data model
 */
data class TransactionInfo(
    val dateEvent: String,
    val quantity: Double,
    val typeBonusName: String,
    val typeOperation: Int
)
