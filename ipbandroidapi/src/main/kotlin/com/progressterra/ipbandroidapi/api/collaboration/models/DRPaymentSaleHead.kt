package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param idrfTypePaymentMethod
 * @param relationData
 * @param sumPayment
 * @param dhSaleHead
 */


data class DRPaymentSaleHead(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("idrfTypePaymentMethod")
    val idrfTypePaymentMethod: String? = null,

    @SerializedName("relationData")
    val relationData: String? = null,

    @SerializedName("sumPayment")
    val sumPayment: Double? = null,

    @SerializedName("dhSaleHead")
    val dhSaleHead: DHSaleHead? = null

)

