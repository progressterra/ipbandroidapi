package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param iddrSaleRow
 * @param idrfTypePaymentMethod
 * @param relationData
 * @param sumPayment
 * @param iddrPaymentSaleHead
 * @param drSaleRow
 */


data class DRPaymentPositionSale(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    @SerializedName("idrfTypePaymentMethod")
    val idrfTypePaymentMethod: String? = null,

    @SerializedName("relationData")
    val relationData: String? = null,

    @SerializedName("sumPayment")
    val sumPayment: Double? = null,

    @SerializedName("iddrPaymentSaleHead")
    val iddrPaymentSaleHead: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

