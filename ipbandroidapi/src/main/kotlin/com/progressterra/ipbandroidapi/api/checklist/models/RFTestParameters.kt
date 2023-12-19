package com.progressterra.ipbandroidapi.api.checklist.models


import com.google.gson.annotations.SerializedName

/**
 * Универсальная структура, которая позволяет разбивать тесты на показатели и производить универсальное представление по языкам
 *
 * @param idrfCheck Какому чек листу/тесту принадлежит параметр
 * @param indexName Индекс параметра
 * @param internalName Представление параметра
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class RFTestParameters (

    /* Какому чек листу/тесту принадлежит параметр */
    @SerializedName("idrfCheck")
    val idrfCheck: String? = null,

    /* Индекс параметра */
    @SerializedName("indexName")
    val indexName: String? = null,

    /* Представление параметра */
    @SerializedName("internalName")
    val internalName: String? = null,

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

