package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строка оплаты на весь документ
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификатор документа к котрому относится строка
 * @param idrfTypePaymentMethod Идентификатор типа оплаты
 * @param relationData Например номер карты по которой прошел платеж
 * @param sumPayment Сумма оплаты
 * @param dhSaleHead
 */

data class DRPaymentSaleHead(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор документа к котрому относится строка */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Идентификатор типа оплаты */
    @SerializedName("idrfTypePaymentMethod")
    val idrfTypePaymentMethod: String? = null,

    /* Например номер карты по которой прошел платеж */
    @SerializedName("relationData")
    val relationData: String? = null,

    /* Сумма оплаты */
    @SerializedName("sumPayment")
    val sumPayment: Double? = null,

    @SerializedName("dhSaleHead")
    val dhSaleHead: DHSaleHead? = null

)

