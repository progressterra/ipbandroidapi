package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param idrfTypeDiscount
 * @param sumDiscount
 * @param reasonDiscounts
 * @param dhSaleHead
 */


data class DRDiscountSaleHead(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("idrfTypeDiscount")
    val idrfTypeDiscount: String? = null,

    @SerializedName("sumDiscount")
    val sumDiscount: Double? = null,

    @SerializedName("reasonDiscounts")
    val reasonDiscounts: String? = null,

    @SerializedName("dhSaleHead")
    val dhSaleHead: DHSaleHead? = null

)

