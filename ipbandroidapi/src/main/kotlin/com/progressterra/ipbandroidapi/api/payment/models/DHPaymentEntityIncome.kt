package com.progressterra.ipbandroidapi.api.payment.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idPaymentData Идентификатор данных оплаты
 * @param amount Сумма, которая выплачивается
 */


data class DHPaymentEntityIncome (

    /* Идентификатор данных оплаты */
    @SerializedName("idPaymentData")
    val idPaymentData: String? = null,

    /* Сумма, которая выплачивается */
    @SerializedName("amount")
    val amount: Double? = null

)

