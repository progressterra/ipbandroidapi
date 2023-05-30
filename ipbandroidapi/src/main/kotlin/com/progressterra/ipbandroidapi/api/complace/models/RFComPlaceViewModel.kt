package com.progressterra.ipbandroidapi.api.complace.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param shopType
 * @param name
 * @param address
 * @param dateOpen
 * @param dateClose
 * @param idrfCtiy
 * @param contacts
 * @param latitude
 * @param longitude
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param city
 * @param listImages
 */
data class RFComPlaceViewModel(

    @SerializedName("shopType") val shopType: TypeComPlace? = null,

    @SerializedName("name") val name: String? = null,

    @SerializedName("address") val address: String? = null,

    @SerializedName("dateOpen") val dateOpen: String? = null,

    @SerializedName("dateClose") val dateClose: String? = null,

    @SerializedName("idrfCtiy") val idrfCtiy: java.util.UUID? = null,

    @SerializedName("contacts") val contacts: String? = null,

    @SerializedName("latitude") val latitude: Double? = null,

    @SerializedName("longitude") val longitude: Double? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique") val idUnique: java.util.UUID? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise") val idEnterprise: java.util.UUID? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded") val dateAdded: String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated") val dateUpdated: String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved") val dateSoftRemoved: String? = null,

    @SerializedName("city") val city: RFCityViewModel? = null,

    @SerializedName("listImages") val listImages: List<RGEntitytMediaDataViewModel>? = null
)
