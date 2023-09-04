package com.progressterra.ipbandroidapi.api.scrm.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idClient 
 * @param dateVerification 
 * @param idManagerVerification 
 * @param dateDeactivation 
 * @param defaultShipping 
 * @param defaultBilling 
 * @param fiasIDCountry 
 * @param fiasIDRegion 
 * @param fiasIDCity 
 * @param fiasIDArea 
 * @param fiasIDDistrict 
 * @param fiasIDStreet 
 * @param fiasIDHouse 
 * @param kladrCountry 
 * @param kladrRegion 
 * @param kladrCity 
 * @param kladrArea 
 * @param kladrDistrict 
 * @param kladrStreet 
 * @param kladrHouse 
 * @param nameCountry 
 * @param nameRegion 
 * @param nameCity 
 * @param nameStreet 
 * @param nameArea 
 * @param nameDistrict 
 * @param postalCode 
 * @param houseNUmber 
 * @param building 
 * @param apartment 
 * @param entrance 
 * @param floor 
 * @param latitude 
 * @param longitude 
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class RGAddressViewModel (

    @SerializedName("idClient")
    val idClient: String? = null,

    @SerializedName("dateVerification")
    val dateVerification: String? = null,

    @SerializedName("idManagerVerification")
    val idManagerVerification: String? = null,

    @SerializedName("dateDeactivation")
    val dateDeactivation: String? = null,

    @SerializedName("defaultShipping")
    val defaultShipping: String? = null,

    @SerializedName("defaultBilling")
    val defaultBilling: String? = null,

    @SerializedName("fiasIDCountry")
    val fiasIDCountry: String? = null,

    @SerializedName("fiasIDRegion")
    val fiasIDRegion: String? = null,

    @SerializedName("fiasIDCity")
    val fiasIDCity: String? = null,

    @SerializedName("fiasIDArea")
    val fiasIDArea: String? = null,

    @SerializedName("fiasIDDistrict")
    val fiasIDDistrict: String? = null,

    @SerializedName("fiasIDStreet")
    val fiasIDStreet: String? = null,

    @SerializedName("fiasIDHouse")
    val fiasIDHouse: String? = null,

    @SerializedName("kladrCountry")
    val kladrCountry: String? = null,

    @SerializedName("kladrRegion")
    val kladrRegion: String? = null,

    @SerializedName("kladrCity")
    val kladrCity: String? = null,

    @SerializedName("kladrArea")
    val kladrArea: String? = null,

    @SerializedName("kladrDistrict")
    val kladrDistrict: String? = null,

    @SerializedName("kladrStreet")
    val kladrStreet: String? = null,

    @SerializedName("kladrHouse")
    val kladrHouse: String? = null,

    @SerializedName("nameCountry")
    val nameCountry: String? = null,

    @SerializedName("nameRegion")
    val nameRegion: String? = null,

    @SerializedName("nameCity")
    val nameCity: String? = null,

    @SerializedName("nameStreet")
    val nameStreet: String? = null,

    @SerializedName("nameArea")
    val nameArea: String? = null,

    @SerializedName("nameDistrict")
    val nameDistrict: String? = null,

    @SerializedName("postalCode")
    val postalCode: String? = null,

    @SerializedName("houseNUmber")
    val houseNUmber: String? = null,

    @SerializedName("building")
    val building: String? = null,

    @SerializedName("apartment")
    val apartment: Int? = null,

    @SerializedName("entrance")
    val entrance: Int? = null,

    @SerializedName("floor")
    val floor: Int? = null,

    @SerializedName("latitude")
    val latitude: Double? = null,

    @SerializedName("longitude")
    val longitude: Double? = null,

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

