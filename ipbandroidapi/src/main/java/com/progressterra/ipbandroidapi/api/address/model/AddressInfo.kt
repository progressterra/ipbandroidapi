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
) {

    constructor(address: Address) : this(
        address.apartment ?: "",
        address.building ?: "",
        address.dateAdded ?: "",
        address.dateDeactivation ?: "",
        address.dateVerification ?: "",
        address.defaultBilling ?: "",
        address.defaultShipping ?: "",
        address.entrance ?: "",
        address.fiasIDArea ?: "",
        address.fiasIDCity ?: "",
        address.fiasIDCountry ?: "",
        address.fiasIDDistrict ?: "",
        address.fiasIDHouse ?: "",
        address.fiasIDRegion ?: "",
        address.fiasIDStreet ?: "",
        address.floor ?: "",
        address.houseNUmber ?: "",
        address.idClient ?: "",
        address.idManagerVerification ?: "",
        address.idUnique ?: "",
        address.kladrArea ?: "",
        address.kladrCity ?: "",
        address.kladrCountry ?: "",
        address.kladrDistrict ?: "",
        address.kladrHouse ?: "",
        address.kladrRegion ?: "",
        address.kladrStreet ?: "",
        address.latitude ?: 0.0,
        address.longitude ?: 0.0,
        address.nameArea ?: "",
        address.nameCity ?: "",
        address.nameCountry ?: "",
        address.nameDistrict ?: "",
        address.nameRegion ?: "",
        address.nameStreet ?: "",
        address.postalCode ?: ""
    )
}
