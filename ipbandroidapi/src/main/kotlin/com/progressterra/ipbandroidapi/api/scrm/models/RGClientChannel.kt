package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idClient Идентификатор клиента
 * @param typeChannel 
 * @param dataChannel Данные канала связи
 * @param idUnique 
 * @param idEnterprise 
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param dateBlocked 
 * @param dateConfirm Дата подтверждения канала связи
 */


data class RGClientChannel (

    /* Идентификатор клиента */
    @SerializedName("idClient")
    val idClient: String? = null,

    @SerializedName("typeChannel")
    val typeChannel: TypeChannelEnum? = null,

    /* Данные канала связи */
    @SerializedName("dataChannel")
    val dataChannel: String? = null,

    @SerializedName("idUnique")
    val idUnique: String? = null,

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

    @SerializedName("dateBlocked")
    val dateBlocked: String? = null,

    /* Дата подтверждения канала связи */
    @SerializedName("dateConfirm")
    val dateConfirm: String? = null

)

