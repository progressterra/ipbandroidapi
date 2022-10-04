package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

data class PaymentRowBonusData(
    val idBonusLife: String,
    val idBonusLog: String,
    val idBonusType: Int,
    val idUnique: String,
    val iddhSaleHead: String,
    val iddrSaleRow: String,
    val nameBonusType: String,
    val sumBonus: Int
) {

    internal constructor(data: DrPaymentRowBonus?) : this(
        data?.idBonusLife ?: "",
        data?.idBonusLog ?: "",
        data?.idBonusType ?: 0,
        data?.idUnique ?: "",
        data?.iddhSaleHead ?: "",
        data?.iddrSaleRow ?: "",
        data?.nameBonusType ?: "",
        data?.sumBonus ?: 0
    )
}
