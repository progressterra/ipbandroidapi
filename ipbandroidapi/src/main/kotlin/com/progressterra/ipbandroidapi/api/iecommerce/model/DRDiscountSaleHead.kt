package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строка скидки, распросстраняющейся на весь документ
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификатор документа к которому относится строка
 * @param idrfTypeDiscount Идентификатор типа примененной скидки
 * @param sumDiscount Суммаа скидки
 * @param reasonDiscounts Причина скидки
 * @param dhSaleHead
 */

data class DRDiscountSaleHead(

    /* Уникальный идентификатор */
    @SerializedName("idUnique") val idUnique: String? = null,

    /* Идентификатор документа к которому относится строка */
    @SerializedName("iddhSaleHead") val iddhSaleHead: String? = null,

    /* Идентификатор типа примененной скидки */
    @SerializedName("idrfTypeDiscount") val idrfTypeDiscount: String? = null,

    /* Суммаа скидки */
    @SerializedName("sumDiscount") val sumDiscount: Double? = null,

    /* Причина скидки */
    @SerializedName("reasonDiscounts") val reasonDiscounts: String? = null,

    @SerializedName("dhSaleHead") val dhSaleHead: DHSaleHead? = null

)

