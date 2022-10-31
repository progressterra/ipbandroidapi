package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строки скидки на конкретную строку документа
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификатор документа к которому относится строка
 * @param iddrSaleRow Идентификатор строки продажи к которой относится строка начисления бонусов
 * @param idrfTypeDiscount Идентификатор типа скидок
 * @param typeDiscount
 * @param percentValue Процент скидки
 * @param sumValue Сумма скидки
 * @param sumDiscount Сумма скидки
 * @param reasonDiscounts Причина (описание) скидки
 * @param iddrDiscountSaleHead Идентфикатор (ссылка) на строку скидки документа
 * @param drSaleRow
 */

data class DRDiscountPosition(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор документа к которому относится строка */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Идентификатор строки продажи к которой относится строка начисления бонусов */
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    /* Идентификатор типа скидок */
    @SerializedName("idrfTypeDiscount")
    val idrfTypeDiscount: String? = null,

    @SerializedName("typeDiscount")
    val typeDiscount: Int? = null,

    /* Процент скидки */
    @SerializedName("percentValue")
    val percentValue: Double? = null,

    /* Сумма скидки */
    @SerializedName("sumValue")
    val sumValue: Double? = null,

    /* Сумма скидки */
    @SerializedName("sumDiscount")
    val sumDiscount: Double? = null,

    /* Причина (описание) скидки */
    @SerializedName("reasonDiscounts")
    val reasonDiscounts: String? = null,

    /* Идентфикатор (ссылка) на строку скидки документа */
    @SerializedName("iddrDiscountSaleHead")
    val iddrDiscountSaleHead: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

