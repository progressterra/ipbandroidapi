package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

data class AddedBonusData(
    val idBonusLog: String,
    val idBonusType: String,
    val idUnique: String,
    val iddhSaleHead: String,
    val iddrSaleRow: String,
    val idrfAction: String,
    val nameBonusType: String,
    val sumBonus: Int
) {

    internal constructor(data: DrAddedBonus?) : this(
        data?.idBonusLog ?: "",
        data?.idBonusType ?: "",
        data?.idUnique ?: "",
        data?.iddhSaleHead ?: "",
        data?.iddrSaleRow ?: "",
        data?.idrfAction ?: "",
        data?.nameBonusType ?: "",
        data?.sumBonus ?: 0
    )
}
