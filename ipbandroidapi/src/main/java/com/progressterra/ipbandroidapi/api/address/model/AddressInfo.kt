package com.progressterra.ipbandroidapi.api.address.model

/**
* Data model
 */
data class AddressInfo(
    val apartment: String = "",
    val building: String = "",
    val dateAdded: String = "",
    val dateDeactivation: String = "",
    val dateVerification: String = "",
    val defaultBilling: String = "",
    val defaultShipping: String = "",
    val entrance: String = "",
    val fiasIDArea: String = "",
    val fiasIDCity: String = "",
    val fiasIDCountry: String = "",
    val fiasIDDistrict: String = "",
    val fiasIDHouse: String = "",
    val fiasIDRegion: String = "",
    val fiasIDStreet: String = "",
    val floor: String = "",
    val houseNUmber: String = "",
    val idClient: String = "",
    val idManagerVerification: String = "",
    val idUnique: String = "",
    val kladrArea: String = "",
    val kladrCity: String = "",
    val kladrCountry: String = "",
    val kladrDistrict: String = "",
    val kladrHouse: String = "",
    val kladrRegion: String = "",
    val kladrStreet: String = "",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val nameArea: String = "",
    val nameCity: String = "",
    val nameCountry: String = "",
    val nameDistrict: String = "",
    val nameRegion: String = "",
    val nameStreet: String = "",
    val postalCode: String = ""
)
