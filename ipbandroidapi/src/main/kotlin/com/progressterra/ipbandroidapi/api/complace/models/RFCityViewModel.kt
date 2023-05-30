package com.progressterra.ipbandroidapi.api.complace.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param name 
 * @param latitudeCenter 
 * @param longitudeCenter 
 * @param radius 
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */
data class RFCityViewModel (

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("latitudeCenter")
    val latitudeCenter: Double? = null,

    @SerializedName("longitudeCenter")
    val longitudeCenter: Double? = null,

    @SerializedName("radius")
    val radius: Int? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: java.util.UUID? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise")
    val idEnterprise: java.util.UUID? = null,

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
