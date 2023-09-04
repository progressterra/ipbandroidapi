package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param name 
 * @param soname 
 * @param patronymic 
 * @param sex 
 * @param dateOfBirth 
 * @param dateOfRegister 
 * @param comment 
 * @param idUnique 
 * @param idEnterprise Идентификаор организации, которой принадлежит клиент
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param dateBlocked 
 * @param additionalInfo 
 * @param eMailGeneral 
 * @param phoneGeneral 
 */


data class ClientsViewModel (

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("soname")
    val soname: String? = null,

    @SerializedName("patronymic")
    val patronymic: String? = null,

    @SerializedName("sex")
    val sex: TypeSex? = null,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String? = null,

    @SerializedName("dateOfRegister")
    val dateOfRegister: String? = null,

    @SerializedName("comment")
    val comment: String? = null,

    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификаор организации, которой принадлежит клиент */
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

    @SerializedName("additionalInfo")
    val additionalInfo: String? = null,

    @SerializedName("eMailGeneral")
    val eMailGeneral: String? = null,

    @SerializedName("phoneGeneral")
    val phoneGeneral: String? = null

)

