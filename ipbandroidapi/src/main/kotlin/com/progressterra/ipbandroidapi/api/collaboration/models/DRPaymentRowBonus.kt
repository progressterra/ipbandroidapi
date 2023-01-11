package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param iddrSaleRow
 * @param idBonusType
 * @param nameBonusType
 * @param idBonusLife
 * @param sumBonus
 * @param idBonusLog
 * @param drSaleRow
 */


data class DRPaymentRowBonus(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    @SerializedName("idBonusType")
    val idBonusType: Int? = null,

    @SerializedName("nameBonusType")
    val nameBonusType: String? = null,

    @SerializedName("idBonusLife")
    val idBonusLife: String? = null,

    @SerializedName("sumBonus")
    val sumBonus: Double? = null,

    @SerializedName("idBonusLog")
    val idBonusLog: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

