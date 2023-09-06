package com.progressterra.ipbandroidapi.api.collaboration.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idClient
 * @param description
 * @param sumTransactions
 * @param availableForWritingBonuses
 * @param sumWritingBonuses (вводится пользователем не больше чем Доступно для списания бонусов)
 * @param chargingBonuses
 * @param endSum SumTransactions - SumWritingBonuses
 */


data class DataHandTransaction(

    @SerializedName("idClient")
    val idClient: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("sumTransactions")
    val sumTransactions: Double? = null,

    @SerializedName("availableForWritingBonuses")
    val availableForWritingBonuses: Double? = null,

    /* (вводится пользователем не больше чем Доступно для списания бонусов) */
    @SerializedName("sumWritingBonuses")
    val sumWritingBonuses: Double? = null,

    @SerializedName("chargingBonuses")
    val chargingBonuses: Double? = null,

    /* SumTransactions - SumWritingBonuses */
    @SerializedName("endSum")
    val endSum: Double? = null

)

