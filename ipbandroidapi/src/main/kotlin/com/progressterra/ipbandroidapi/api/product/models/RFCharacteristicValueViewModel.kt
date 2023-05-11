package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idrfCharacteristicType Характеристика, к которой относится значение
 * @param valueAsString Строковое значение характеристики
 * @param valueAsNumber Числовое значение характеристики
 * @param valueAsDate
 * @param valueAsJSON Специфические данные значения характеристики
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param viewData Как представляем характеристику по умолчанию
 */
data class RFCharacteristicValueViewModel(

    /* Характеристика, к которой относится значение */
    @SerializedName("idrfCharacteristicType") val idrfCharacteristicType: String? = null,

    /* Строковое значение характеристики */
    @SerializedName("valueAsString") val valueAsString: String? = null,

    /* Числовое значение характеристики */
    @SerializedName("valueAsNumber") val valueAsNumber: Double? = null,

    @SerializedName("valueAsDate") val valueAsDate: String? = null,

    /* Специфические данные значения характеристики */
    @SerializedName("valueAsJSON") val valueAsJSON: String? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique") val idUnique: String? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise") val idEnterprise: String? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded") val dateAdded: String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated") val dateUpdated: String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved") val dateSoftRemoved: String? = null,

    /* Как представляем характеристику по умолчанию */
    @SerializedName("viewData") val viewData: String? = null
)
