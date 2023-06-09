package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 * Содержит значение поля
 *
 * @param idrfCharacteristicType Значение харатеристики (к какому типу документа относится поле), на основе который создано поле
 * @param name Наименование поля
 * @param comment Подсказка, которую можно отобразить пользователю
 * @param order Позволяет организовать сортировку данных
 * @param typeValue
 * @param valueData Самое значение
 */


data class FieldData(

    /* Значение харатеристики (к какому типу документа относится поле), на основе который создано поле */
    @SerializedName("idrfCharacteristicType")
    val idrfCharacteristicType: String? = null,

    /* Наименование поля */
    @SerializedName("name")
    val name: String? = null,

    /* Подсказка, которую можно отобразить пользователю */
    @SerializedName("comment")
    val comment: String? = null,

    /* Позволяет организовать сортировку данных */
    @SerializedName("order")
    val order: Int? = null,

    @SerializedName("typeValue")
    val typeValue: TypeValueCharacteristic? = null,

    /* Самое значение */
    @SerializedName("valueData")
    val valueData: String? = null

)

