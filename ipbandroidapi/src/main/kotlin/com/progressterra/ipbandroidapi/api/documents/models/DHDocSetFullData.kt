package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 * Полная информация по набору документов  Включает значения самих документов
 *
 * @param idSpecification Идентифиикатор спецификации
 * @param idClient Идентфикатор клиента
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param specification
 * @param listProductCharacteristic Список документ
 */
data class DHDocSetFullData(

    /* Идентифиикатор спецификации */
    @SerializedName("idSpecification")
    val idSpecification: String? = null,

    /* Идентфикатор клиента */
    @SerializedName("idClient")
    val idClient: String? = null,

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

    @SerializedName("specification")
    val specification: RFSpecification? = null,

    /* Список документ */
    @SerializedName("listProductCharacteristic")
    val listProductCharacteristic: List<CharacteristicData>? = null

)
