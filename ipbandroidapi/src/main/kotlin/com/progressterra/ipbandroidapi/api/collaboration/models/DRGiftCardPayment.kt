package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param typeCard
 * @param numberCard
 * @param sumInCard
 * @param sumPayment
 * @param dhSaleHead
 */


data class DRGiftCardPayment(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("typeCard")
    val typeCard: Int? = null,

    @SerializedName("numberCard")
    val numberCard: Long? = null,

    @SerializedName("sumInCard")
    val sumInCard: Double? = null,

    @SerializedName("sumPayment")
    val sumPayment: Double? = null,

    @SerializedName("dhSaleHead")
    val dhSaleHead: DHSaleHead? = null

)

