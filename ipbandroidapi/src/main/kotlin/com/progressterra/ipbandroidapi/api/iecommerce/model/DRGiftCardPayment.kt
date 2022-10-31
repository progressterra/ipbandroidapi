package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строки оплат сделанных с помощью сертификатов
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификтаор документа к которому относится строка
 * @param typeCard Тип сертификата
 * @param numberCard Номер идентификатора
 * @param sumInCard Сумма на сертификате
 * @param sumPayment Сумма оплаты сертифкатом
 * @param dhSaleHead
 */

data class DRGiftCardPayment(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификтаор документа к которому относится строка */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Тип сертификата */
    @SerializedName("typeCard")
    val typeCard: Int? = null,

    /* Номер идентификатора */
    @SerializedName("numberCard")
    val numberCard: Long? = null,

    /* Сумма на сертификате */
    @SerializedName("sumInCard")
    val sumInCard: Double? = null,

    /* Сумма оплаты сертифкатом */
    @SerializedName("sumPayment")
    val sumPayment: Double? = null,

    @SerializedName("dhSaleHead")
    val dhSaleHead: DHSaleHead? = null

)

