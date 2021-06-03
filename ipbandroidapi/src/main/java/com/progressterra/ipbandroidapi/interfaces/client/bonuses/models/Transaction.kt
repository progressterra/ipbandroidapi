package com.progressterra.ipbandroidapi.interfaces.client.bonuses.models

data class Transaction (
    val dateEvent: String,
    val quantity: Int,
    val typeBonusName: String,
    val typeOperation: Int
)
