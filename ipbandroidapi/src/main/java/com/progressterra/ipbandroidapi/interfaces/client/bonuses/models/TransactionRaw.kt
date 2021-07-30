package com.progressterra.ipbandroidapi.interfaces.client.bonuses.models

import java.util.*

data class TransactionRaw(
    val dateEvent: Date,
    val quantity: Int,
    val typeBonusName: String,
    val typeOperation: Int
)