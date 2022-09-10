package com.progressterra.ipbandroidapi.api.address.model

import com.google.gson.annotations.SerializedName

internal data class AddressRaw(
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

    constructor(addressData: AddressData) : this(
        addressData.apartment,
        addressData.building,
        addressData.dateAdded,
        addressData.dateDeactivation,
        addressData.dateVerification,
        addressData.defaultBilling,
        addressData.defaultShipping,
        addressData.entrance,
        addressData.fiasIDArea,
        addressData.fiasIDCity,
        addressData.fiasIDCountry,
        addressData.fiasIDDistrict,
        addressData.fiasIDHouse,
        addressData.fiasIDRegion,
        addressData.fiasIDStreet,
        addressData.floor,
        addressData.houseNUmber,
        addressData.idClient,
        addressData.idManagerVerification,
        addressData.idUnique,
        addressData.kladrArea,
        addressData.kladrCity,
        addressData.kladrCountry,
        addressData.kladrDistrict,
        addressData.kladrHouse,
        addressData.kladrRegion,
        addressData.kladrStreet,
        addressData.latitude,
        addressData.longitude,
        addressData.nameArea,
        addressData.nameCity,
        addressData.nameCountry,
        addressData.nameDistrict,
        addressData.nameRegion,
        addressData.nameStreet,
        addressData.postalCode
    )
}