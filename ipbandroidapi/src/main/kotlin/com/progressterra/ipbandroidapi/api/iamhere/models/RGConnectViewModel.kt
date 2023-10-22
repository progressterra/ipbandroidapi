package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 * В зависимости от статуса выдаем полную или не частничную информацию  Выдаем полную информацию о человеке с которым хотим инициировать знакомство
 *
 * @param idClientInitiator Пользователь, который иницирует общение
 * @param idClientTarget С кем хотим начать общение
 * @param statusConnect
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param targetClientData
 * @param initiatorClientData
 */


data class RGConnectViewModel(

    /* Пользователь, который иницирует общение */
    @SerializedName("idClientInitiator")
    val idClientInitiator: String? = null,

    /* С кем хотим начать общение */
    @SerializedName("idClientTarget")
    val idClientTarget: String? = null,

    @SerializedName("statusConnect")
    val statusConnect: EnumTypeStatusConnect? = null,

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

    @SerializedName("targetClientData")
    val targetClientData: RGClientDataViewModel? = null,

    @SerializedName("initiatorClientData")
    val initiatorClientData: RGClientDataViewModel? = null

)

