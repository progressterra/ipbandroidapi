package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 * Данные по предоставленной рассрочке
 *
 * @param countMonthPayment Количество месяцев, на которое дается расрочка
 * @param amountPaymentInMonth Сумма оплаты в месяц
 */
data class InstallmentPlan(

    /* Количество месяцев, на которое дается расрочка */
    @SerializedName("countMonthPayment") val countMonthPayment: Int? = null,

    /* Сумма оплаты в месяц */
    @SerializedName("amountPaymentInMonth") val amountPaymentInMonth: Double? = null
)
