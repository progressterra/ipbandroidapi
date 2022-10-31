package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строка оплаты позиции (товара)
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификатор документ (справочно)
 * @param iddrSaleRow Идентификатор строки документа, которая оплачиывается
 * @param idrfTypePaymentMethod Идентификатор типа оплаты
 * @param relationData Комментарий
 * @param sumPayment Сумма оплаты
 * @param iddrPaymentSaleHead
 * @param drSaleRow
 */

data class DRPaymentPositionSale(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор документ (справочно) */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Идентификатор строки документа, которая оплачиывается */
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    /* Идентификатор типа оплаты */
    @SerializedName("idrfTypePaymentMethod")
    val idrfTypePaymentMethod: String? = null,

    /* Комментарий */
    @SerializedName("relationData")
    val relationData: String? = null,

    /* Сумма оплаты */
    @SerializedName("sumPayment")
    val sumPayment: Double? = null,

    @SerializedName("iddrPaymentSaleHead")
    val iddrPaymentSaleHead: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

