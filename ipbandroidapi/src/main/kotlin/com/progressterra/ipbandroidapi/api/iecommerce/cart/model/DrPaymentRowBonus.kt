package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class DrPaymentRowBonus(
    @SerializedName("idBonusLife")
    val idBonusLife: String?,
    @SerializedName("idBonusLog")
    val idBonusLog: String?,
    @SerializedName("idBonusType")
    val idBonusType: Int?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String?,
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String?,
    @SerializedName("nameBonusType")
    val nameBonusType: String?,
    @SerializedName("sumBonus")
    val sumBonus: Int?
)