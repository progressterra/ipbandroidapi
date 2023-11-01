package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idClient
 * @param startDateWantMeet Если дата установлена, значит пользователь хочет знакомиться
 * @param nickName
 * @param idMediaDataAvatar Идентификатор медиданных аватара
 * @param idMainMediaData Идентификатор медиаданных, которые указаны как основное
 * @param descriptionAboutMe Краткое описание о себе
 * @param idrfTarget Цель знакомтсва из справочника целей, но пользователь может указать свою, тогда тут nulls
 * @param targetJSONData
 * @param geoDataJSONData
 * @param listInterestsJSONData Список интересов серриализованный в JSON
 * @param latitudeReal
 * @param longitudeReal
 * @param latitudePlace
 * @param longitudePlace
 * @param idrfPlace Коммерческое место из сервиса коммерческих точек
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param target
 * @param currentGeoData
 * @param listInterests
 * @param listImages
 * @param avatarMediaData
 */


data class RGClientDataViewModel(

    @SerializedName("nickName")
    val nickName: String? = null,

    /* Краткое описание о себе */
    @SerializedName("descriptionAboutMe")
    val descriptionAboutMe: String? = null,

    @SerializedName("idClient")
    val idClient: String? = null,

    /* Если дата установлена, значит пользователь хочет знакомиться */
    @SerializedName("startDateWantMeet")
    val startDateWantMeet: String? = null,

    /* Идентификатор медиданных аватара */
    @SerializedName("idMediaDataAvatar")
    val idMediaDataAvatar: String? = null,

    /* Идентификатор медиаданных, которые указаны как основное */
    @SerializedName("idMainMediaData")
    val idMainMediaData: String? = null,


    /* Цель знакомтсва из справочника целей, но пользователь может указать свою, тогда тут nulls */
    @SerializedName("idrfTarget")
    val idrfTarget: String? = null,

    @SerializedName("targetJSONData")
    val targetJSONData: String? = null,

    @SerializedName("geoDataJSONData")
    val geoDataJSONData: String? = null,

    /* Список интересов серриализованный в JSON */
    @SerializedName("listInterestsJSONData")
    val listInterestsJSONData: String? = null,

    @SerializedName("latitudeReal")
    val latitudeReal: Double? = null,

    @SerializedName("longitudeReal")
    val longitudeReal: Double? = null,

    @SerializedName("latitudePlace")
    val latitudePlace: Double? = null,

    @SerializedName("longitudePlace")
    val longitudePlace: Double? = null,
    /* Коммерческое место из сервиса коммерческих точек */

    @SerializedName("idrfPlace")
    val idrfPlace: String? = null,

    @SerializedName("sex")
    val sex: TypeSex? = null,
    /* Уникальный идентификатор */

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("age")
    val age: Int? = null,

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

    @SerializedName("target")
    val target: RFTargetViewModel? = null,

    @SerializedName("currentGeoData")
    val currentGeoData: GeoData? = null,

    @SerializedName("listInterests")
    val listInterests: List<RFInterestViewModel>? = null,

    @SerializedName("listProfessions")
    val listProfessions: List<RFInterestViewModel>? = null,

    @SerializedName("listImages")
    val listImages: List<RGEntitytMediaDataViewModel>? = null,

    @SerializedName("avatarMediaData")
    val avatarMediaData: RGEntitytMediaDataViewModel? = null

)

