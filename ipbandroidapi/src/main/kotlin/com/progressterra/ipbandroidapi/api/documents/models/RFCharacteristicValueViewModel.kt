package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idrfCharacteristicType Характеристика, к которой относится значение
 * @param idClient Клиент, которому принадлежит документ
 * @param statusDoc
 * @param idManagerCalculation Идентификатор менеджера, который осуществил подтверждение документа
 * @param dateCalculation Дата подтверждения документа менеджером
 * @param reasonReject
 * @param valueAsString Строковое значение характеристики
 * @param valueAsNumber Числовое значение характеристики
 * @param valueAsDate
 * @param valueAsReference Ссылка на тип данных. Хранится как идентификатор сущности в базе данных конкртеного типа
 * @param valueAsJSON Специфические данные значения характеристики
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param viewData Как представляем характеристику по умолчанию
 * @param listImages Список изображений
 * @param characteristicType
 */


data class RFCharacteristicValueViewModel(

    /* Характеристика, к которой относится значение */
    @SerializedName("idrfCharacteristicType")
    val idrfCharacteristicType: String? = null,

    /* Клиент, которому принадлежит документ */
    @SerializedName("idClient")
    val idClient: String? = null,

    @SerializedName("statusDoc")
    val statusDoc: TypeStatusDoc? = null,

    /* Идентификатор менеджера, который осуществил подтверждение документа */
    @SerializedName("idManagerCalculation")
    val idManagerCalculation: String? = null,

    /* Дата подтверждения документа менеджером */
    @SerializedName("dateCalculation")
    val dateCalculation: String? = null,

    @SerializedName("reasonReject")
    val reasonReject: String? = null,

    /* Строковое значение характеристики */
    @SerializedName("valueAsString")
    val valueAsString: String? = null,

    /* Числовое значение характеристики */
    @SerializedName("valueAsNumber")
    val valueAsNumber: Double? = null,

    @SerializedName("valueAsDate")
    val valueAsDate: String? = null,

    /* Ссылка на тип данных. Хранится как идентификатор сущности в базе данных конкртеного типа */
    @SerializedName("valueAsReference")
    val valueAsReference: String? = null,

    /* Специфические данные значения характеристики */
    @SerializedName("valueAsJSON")
    val valueAsJSON: String? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded")
    val dateAdded: String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated")
    val dateUpdated: String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String? = null,

    /* Как представляем характеристику по умолчанию */
    @SerializedName("viewData")
    val viewData: String? = null,

    /* Список изображений */
    @SerializedName("listImages")
    val listImages: List<RGEntitytMediaDataViewModel>? = null,

    @SerializedName("characteristicType")
    val characteristicType: RFCharacteristicTypeViewModel? = null

)

