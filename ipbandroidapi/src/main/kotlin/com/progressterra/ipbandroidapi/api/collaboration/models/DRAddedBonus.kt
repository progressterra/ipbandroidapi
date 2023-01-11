package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param iddrSaleRow
 * @param idrfAction
 * @param idBonusType
 * @param nameBonusType
 * @param sumBonus
 * @param idBonusLog
 * @param drSaleRow
 */


data class DRAddedBonus(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    @SerializedName("idrfAction")
    val idrfAction: String? = null,

    @SerializedName("idBonusType")
    val idBonusType: String? = null,

    @SerializedName("nameBonusType")
    val nameBonusType: String? = null,

    @SerializedName("sumBonus")
    val sumBonus: Double? = null,

    @SerializedName("idBonusLog")
    val idBonusLog: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

