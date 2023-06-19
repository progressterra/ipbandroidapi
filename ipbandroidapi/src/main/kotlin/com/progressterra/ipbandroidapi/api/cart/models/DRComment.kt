package com.progressterra.ipbandroidapi.api.cart.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param iddhSaleHead 
 * @param comment Сам комментарий
 * @param messageForClient Сообщение клиенту, которое может быть ответом на комментарий
 * @param isInternal Признак того, что это внутренний комментарий  Например, комментарий к изменению статуов документов
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class DRComment (

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Сам комментарий */
    @SerializedName("comment")
    val comment: String? = null,

    /* Сообщение клиенту, которое может быть ответом на комментарий */
    @SerializedName("messageForClient")
    val messageForClient: String? = null,

    /* Признак того, что это внутренний комментарий  Например, комментарий к изменению статуов документов */
    @SerializedName("isInternal")
    val isInternal: Boolean? = null,

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

