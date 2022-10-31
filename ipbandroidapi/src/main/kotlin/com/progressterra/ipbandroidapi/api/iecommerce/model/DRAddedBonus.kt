package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строки начисления бонусов для строки документа
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификатор документа к которому относится строка
 * @param iddrSaleRow Идентификатор строки продажи к которой относится строка начисления бонусов
 * @param idrfAction Идентификатор акции в рамках которой начисляютяс бонусы
 * @param idBonusType Идентификатор типа бонусов
 * @param nameBonusType Имя типа бонусов
 * @param sumBonus Сумма начисляемых бонусов
 * @param idBonusLog Идентификатор транзакции по которой прошло начисление
 * @param drSaleRow
 */

data class DRAddedBonus(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор документа к которому относится строка */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Идентификатор строки продажи к которой относится строка начисления бонусов */
    @SerializedName("iddrSaleRow")
    val iddrSaleRow: String? = null,

    /* Идентификатор акции в рамках которой начисляютяс бонусы */
    @SerializedName("idrfAction")
    val idrfAction: String? = null,

    /* Идентификатор типа бонусов */
    @SerializedName("idBonusType")
    val idBonusType: String? = null,

    /* Имя типа бонусов */
    @SerializedName("nameBonusType")
    val nameBonusType: String? = null,

    /* Сумма начисляемых бонусов */
    @SerializedName("sumBonus")
    val sumBonus: Double? = null,

    /* Идентификатор транзакции по которой прошло начисление */
    @SerializedName("idBonusLog")
    val idBonusLog: String? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: DRSaleRow? = null

)

