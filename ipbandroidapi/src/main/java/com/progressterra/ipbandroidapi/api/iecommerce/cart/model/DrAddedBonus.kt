package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class DrAddedBonus(
    @SerializedName("idBonusLog")
    val idBonusLog: String?,
    @SerializedName("idBonusType")
    val idBonusType: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String?,
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String?,
    @SerializedName("idrfAction")
    val idrfAction: String?,
    @SerializedName("nameBonusType")
    val nameBonusType: String?,
    @SerializedName("sumBonus")
    val sumBonus: Int?
)