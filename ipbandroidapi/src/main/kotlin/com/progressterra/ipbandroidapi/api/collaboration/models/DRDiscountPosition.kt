package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param iddrSaleRow
 * @param idrfTypeDiscount
 * @param typeDiscount
 * @param percentValue
 * @param sumValue
 * @param sumDiscount
 * @param reasonDiscounts
 * @param iddrDiscountSaleHead
 * @param drSaleRow
 */


data class DRDiscountPosition(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    @SerializedName("idrfTypeDiscount")
    val idrfTypeDiscount: String? = null,

    @SerializedName("typeDiscount")
    val typeDiscount: Int? = null,

    @SerializedName("percentValue")
    val percentValue: Double? = null,

    @SerializedName("sumValue")
    val sumValue: Double? = null,

    @SerializedName("sumDiscount")
    val sumDiscount: Double? = null,

    @SerializedName("reasonDiscounts")
    val reasonDiscounts: String? = null,

    @SerializedName("iddrDiscountSaleHead")
    val iddrDiscountSaleHead: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

