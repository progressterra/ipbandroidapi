package com.progressterra.ipbandroidapi.api.messenger.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idrgDialog Идентифкиатор диалога
 * @param idClient Идентификатор клиента
 * @param dateLastMessages Дата последнего сообщения созданного
 * @param dateLastRead Дата последнего прочтенного сообщения
 * @param idLastReadMessages Идентификатор последнего прочтенного сообщения
 * @param metaDataClientJSON Данные клиента в JSON формате
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param clientMetaData 
 */


data class RGDialogsClientsViewModel (

    /* Идентифкиатор диалога */
    @SerializedName("idrgDialog")
    val idrgDialog: String? = null,

    /* Идентификатор клиента */
    @SerializedName("idClient")
    val idClient: String? = null,

    /* Дата последнего сообщения созданного */
    @SerializedName("dateLastMessages")
    val dateLastMessages: String? = null,

    /* Дата последнего прочтенного сообщения */
    @SerializedName("dateLastRead")
    val dateLastRead: String? = null,

    /* Идентификатор последнего прочтенного сообщения */
    @SerializedName("idLastReadMessages")
    val idLastReadMessages: String? = null,

    /* Данные клиента в JSON формате */
    @SerializedName("metaDataClientJSON")
    val metaDataClientJSON: String? = null,

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

    @SerializedName("clientMetaData")
    val clientMetaData: MetaDataClientDialogStore? = null

)

