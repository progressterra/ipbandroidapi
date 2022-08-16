package com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.cart


import com.google.gson.annotations.SerializedName

data class DrDiscountPosition(
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,
    @SerializedName("iddrDiscountSaleHead")
    val iddrDiscountSaleHead: String? = null,
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,
    @SerializedName("idrfTypeDiscount")
    val idrfTypeDiscount: String? = null,
    @SerializedName("percentValue")
    val percentValue: Int? = null,
    @SerializedName("reasonDiscounts")
    val reasonDiscounts: String? = null,
    @SerializedName("sumDiscount")
    val sumDiscount: Int? = null,
    @SerializedName("sumValue")
    val sumValue: Int? = null,
    @SerializedName("typeDiscount")
    val typeDiscount: Int? = null
)