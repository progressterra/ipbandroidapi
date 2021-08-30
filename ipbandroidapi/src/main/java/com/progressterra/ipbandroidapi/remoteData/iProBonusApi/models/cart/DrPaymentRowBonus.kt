package com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart


import com.google.gson.annotations.SerializedName

data class DrPaymentRowBonus(
    @SerializedName("idBonusLife")
    val idBonusLife: String? = null,
    @SerializedName("idBonusLog")
    val idBonusLog: String? = null,
    @SerializedName("idBonusType")
    val idBonusType: Int? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,
    @SerializedName("nameBonusType")
    val nameBonusType: String? = null,
    @SerializedName("sumBonus")
    val sumBonus: Int? = null
)