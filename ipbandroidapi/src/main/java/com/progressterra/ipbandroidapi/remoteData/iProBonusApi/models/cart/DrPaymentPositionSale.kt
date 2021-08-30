package com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart


import com.google.gson.annotations.SerializedName

data class DrPaymentPositionSale(
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,
    @SerializedName("iddrPaymentSaleHead")
    val iddrPaymentSaleHead: String? = null,
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,
    @SerializedName("idrfTypePaymentMethod")
    val idrfTypePaymentMethod: String? = null,
    @SerializedName("relationData")
    val relationData: String? = null,
    @SerializedName("sumPayment")
    val sumPayment: Int? = null
)