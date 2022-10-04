package com.progressterra.ipbandroidapi.api.ibonus.model

data class TransactionData(
    val dateEvent: String,
    val quantity: Double,
    val typeBonusName: String,
    val typeOperation: Int
) {

    internal constructor(data: TransactionListResponse.Data) : this(
        data.dateEvent,
        data.quantity,
        data.typeBonusName ?: "",
        data.typeOperation
    )
}
