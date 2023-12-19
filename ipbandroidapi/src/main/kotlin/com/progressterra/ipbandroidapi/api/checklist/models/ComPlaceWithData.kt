package com.progressterra.ipbandroidapi.api.checklist.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param shopType 
 * @param name 
 * @param address 
 * @param dateOpen 
 * @param dateClose 
 * @param idrfCtiy 
 * @param contacts 
 * @param latitude 
 * @param longitude 
 * @param city 
 * @param listImages 
 * @param countAvailableRFCheck Количество доступных для данного места чек листов
 * @param countDHCheckPerformedForExecution Количество документов к выполнению
 */


data class ComPlaceWithData (

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

    @SerializedName("shopType")
    val shopType: TypeComPlace? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("address")
    val address: String? = null,

    @SerializedName("dateOpen")
    val dateOpen: String? = null,

    @SerializedName("dateClose")
    val dateClose: String? = null,

    @SerializedName("idrfCtiy")
    val idrfCtiy: String? = null,

    @SerializedName("contacts")
    val contacts: String? = null,

    @SerializedName("latitude")
    val latitude: Double? = null,

    @SerializedName("longitude")
    val longitude: Double? = null,

    @SerializedName("city")
    val city: RFCityViewModel? = null,

    @SerializedName("listImages")
    val listImages: List<RGEntitytMediaDataViewModel>? = null,

    /* Количество доступных для данного места чек листов */
    @SerializedName("countAvailableRFCheck")
    val countAvailableRFCheck: Int? = null,

    /* Количество документов к выполнению */
    @SerializedName("countDHCheckPerformedForExecution")
    val countDHCheckPerformedForExecution: Int? = null

)

