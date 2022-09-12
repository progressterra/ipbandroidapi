package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class DrPaymentPositionSale(
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String?,
    @SerializedName("iddrPaymentSaleHead")
    val iddrPaymentSaleHead: String?,
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String?,
    @SerializedName("idrfTypePaymentMethod")
    val idrfTypePaymentMethod: String?,
    @SerializedName("relationData")
    val relationData: String?,
    @SerializedName("sumPayment")
    val sumPayment: Int?
)