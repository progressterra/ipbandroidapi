package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строка оплаты бонусами
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификатор документ (справочно)
 * @param iddrSaleRow Идентификатор строки документа, которая оплачиывается
 * @param idBonusType Идентификатор типа бонусов (устаревший)
 * @param nameBonusType Наименование типа бонуса
 * @param idBonusLife Идентификатор жизни бонусов
 * @param sumBonus Сумма оплаченная бонусами
 * @param idBonusLog Идентификатор транзакции по которой прошло списание
 * @param drSaleRow
 */

data class DRPaymentRowBonus(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор документ (справочно) */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Идентификатор строки документа, которая оплачиывается */
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    /* Идентификатор типа бонусов (устаревший) */
    @SerializedName("idBonusType")
    val idBonusType: Int? = null,

    /* Наименование типа бонуса */
    @SerializedName("nameBonusType")
    val nameBonusType: String? = null,

    /* Идентификатор жизни бонусов */
    @SerializedName("idBonusLife")
    val idBonusLife: String? = null,

    /* Сумма оплаченная бонусами */
    @SerializedName("sumBonus")
    val sumBonus: Double? = null,

    /* Идентификатор транзакции по которой прошло списание */
    @SerializedName("idBonusLog")
    val idBonusLog: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

