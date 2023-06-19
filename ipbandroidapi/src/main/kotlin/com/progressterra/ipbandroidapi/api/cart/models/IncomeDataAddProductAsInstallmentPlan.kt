package com.progressterra.ipbandroidapi.api.cart.models


import com.google.gson.annotations.SerializedName

/**
 * Данные о номенклатуре, количестве и рассрочке
 *
 * @param idrfNomenclature 
 * @param count 
 * @param countMonthPayment 
 * @param amountPaymentInMonth 
 */


data class IncomeDataAddProductAsInstallmentPlan (

    @SerializedName("idrfNomenclature")
    val idrfNomenclature: String? = null,

    @SerializedName("count")
    val count: Int? = null,

    @SerializedName("countMonthPayment")
    val countMonthPayment: Int? = null,

    @SerializedName("amountPaymentInMonth")
    val amountPaymentInMonth: Double? = null

)

