package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class DrDiscountPosition(
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String?,
    @SerializedName("iddrDiscountSaleHead")
    val iddrDiscountSaleHead: String?,
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String?,
    @SerializedName("idrfTypeDiscount")
    val idrfTypeDiscount: String?,
    @SerializedName("percentValue")
    val percentValue: Int?,
    @SerializedName("reasonDiscounts")
    val reasonDiscounts: String?,
    @SerializedName("sumDiscount")
    val sumDiscount: Int?,
    @SerializedName("sumValue")
    val sumValue: Int?,
    @SerializedName("typeDiscount")
    val typeDiscount: Int?
)