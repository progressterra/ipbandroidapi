package com.progressterra.ipbandroidapi.api.address.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class Address(
    @SerializedName("apartment")
    val apartment: String?,
    @SerializedName("building")
    val building: String?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateDeactivation")
    val dateDeactivation: String?,
    @SerializedName("dateVerification")
    val dateVerification: String?,
    @SerializedName("defaultBilling")
    val defaultBilling: String?,
    @SerializedName("defaultShipping")
    val defaultShipping: String?,
    @SerializedName("entrance")
    val entrance: String?,
    @SerializedName("fiasIDArea")
    val fiasIDArea: String?,
    @SerializedName("fiasIDCity")
    val fiasIDCity: String?,
    @SerializedName("fiasIDCountry")
    val fiasIDCountry: String?,
    @SerializedName("fiasIDDistrict")
    val fiasIDDistrict: String?,
    @SerializedName("fiasIDHouse")
    val fiasIDHouse: String?,
    @SerializedName("fiasIDRegion")
    val fiasIDRegion: String?,
    @SerializedName("fiasIDStreet")
    val fiasIDStreet: String?,
    @SerializedName("floor")
    val floor: String?,
    @SerializedName("houseNUmber")
    val houseNUmber: String?,
    @SerializedName("idClient")
    val idClient: String?,
    @SerializedName("idManagerVerification")
    val idManagerVerification: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("kladrArea")
    val kladrArea: String?,
    @SerializedName("kladrCity")
    val kladrCity: String?,
    @SerializedName("kladrCountry")
    val kladrCountry: String?,
    @SerializedName("kladrDistrict")
    val kladrDistrict: String?,
    @SerializedName("kladrHouse")
    val kladrHouse: String?,
    @SerializedName("kladrRegion")
    val kladrRegion: String?,
    @SerializedName("kladrStreet")
    val kladrStreet: String?,
    @SerializedName("latitude")
    val latitude: Double?,
    @SerializedName("longitude")
    val longitude: Double?,
    @SerializedName("nameArea")
    val nameArea: String?,
    @SerializedName("nameCity")
    val nameCity: String?,
    @SerializedName("nameCountry")
    val nameCountry: String?,
    @SerializedName("nameDistrict")
    val nameDistrict: String?,
    @SerializedName("nameRegion")
    val nameRegion: String?,
    @SerializedName("nameStreet")
    val nameStreet: String?,
    @SerializedName("postalCode")
    val postalCode: String?
) {

    //TODO experiment with internal constructors
    constructor(addressInfo: AddressInfo) : this(
        addressInfo.apartment,
        addressInfo.building,
        addressInfo.dateAdded,
        addressInfo.dateDeactivation,
        addressInfo.dateVerification,
        addressInfo.defaultBilling,
        addressInfo.defaultShipping,
        addressInfo.entrance,
        addressInfo.fiasIDArea,
        addressInfo.fiasIDCity,
        addressInfo.fiasIDCountry,
        addressInfo.fiasIDDistrict,
        addressInfo.fiasIDHouse,
        addressInfo.fiasIDRegion,
        addressInfo.fiasIDStreet,
        addressInfo.floor,
        addressInfo.houseNUmber,
        addressInfo.idClient,
        addressInfo.idManagerVerification,
        addressInfo.idUnique,
        addressInfo.kladrArea,
        addressInfo.kladrCity,
        addressInfo.kladrCountry,
        addressInfo.kladrDistrict,
        addressInfo.kladrHouse,
        addressInfo.kladrRegion,
        addressInfo.kladrStreet,
        addressInfo.latitude,
        addressInfo.longitude,
        addressInfo.nameArea,
        addressInfo.nameCity,
        addressInfo.nameCountry,
        addressInfo.nameDistrict,
        addressInfo.nameRegion,
        addressInfo.nameStreet,
        addressInfo.postalCode
    )
}