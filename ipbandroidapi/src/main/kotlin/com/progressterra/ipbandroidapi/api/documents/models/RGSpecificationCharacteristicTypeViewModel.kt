package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idrfSpecification
 * @param idrfCharacteristicType Тип характеристики, которая присутствует в спецификации продукта
 * @param isMandatory Признак обязательной характеристики, которую нужно обязательно заполнить
 * @param imageRequired Признак того, что требуется фото для документа
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */
data class RGSpecificationCharacteristicTypeViewModel(

    @SerializedName("idrfSpecification")
    val idrfSpecification: String? = null,

    /* Тип характеристики, которая присутствует в спецификации продукта */
    @SerializedName("idrfCharacteristicType")
    val idrfCharacteristicType: String? = null,

    /* Признак обязательной характеристики, которую нужно обязательно заполнить */
    @SerializedName("isMandatory")
    val isMandatory: Boolean? = null,

    /* Признак того, что требуется фото для документа */
    @SerializedName("imageRequired")
    val imageRequired: Boolean? = null,

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
    val dateSoftRemoved: String? = null

)
