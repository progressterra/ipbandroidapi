package com.progressterra.ipbandroidapi.interfaces.client.addresses

import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.Address


data class AddressUI(
    var idUnique: String? = null,
    var idClient: String? = null,
    var dateAdded: String? = null,
    var dateVerification: String? = null,
    var idManagerVerification: String? = null,
    var dateDeactivation: String? = null,
    var defaultShipping: String? = null,
    var defaultBilling: String? = null,
    var fiasIDCountry: String? = null,
    var fiasIDRegion: String? = null,
    var fiasIDCity: String? = null,
    var fiasIDArea: String? = null,
    var fiasIDDistrict: String? = null,
    var fiasIDStreet: String? = null,
    var fiasIDHouse: String? = null,
    var kladrCountry: String? = null,
    var kladrRegion: String? = null,
    var kladrCity: String? = null,
    var kladrArea: String? = null,
    var kladrDistrict: String? = null,
    var kladrStreet: String? = null,
    var kladrHouse: String? = null,
    var nameCountry: String? = null,
    var nameRegion: String? = null,
    var nameCity: String? = null,
    var nameStreet: String? = null,
    var nameArea: String? = null,
    var nameDistrict: String? = null,
    var postalCode: String? = null,
    var houseNUmber: String? = null,
    var building: String? = null,
    var apartment: String? = null,
    var entrance: String? = null,
    var floor: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    val isDefaultShippingAddress: Boolean? = null,
    val isDefaultBillingAddress: Boolean? = null
) {
    fun getFullAddress(): String {
        var address = ""

        nameStreet?.let {
            address += "ул $it, "
        }

        houseNUmber?.let {
            address += "д $it"
        }

        apartment?.let {
            if (it != "0")
                address += ", кв $it"
        }

        floor?.let {
            address += ", эт $it"
        }

        entrance?.let {
            address += ", п $it "
        }
        return address
    }

    fun convertToUpdateAddressRequest(): Address {
        return Address(
            idUnique = idUnique,
            nameCity = nameCity,
            postalCode = postalCode,
            building = building,
            apartment = apartment,
            floor = floor,
            nameStreet = nameStreet,
            entrance = entrance,
            idClient = idClient,
            dateAdded = dateAdded,
            dateVerification = dateVerification,
            idManagerVerification = idManagerVerification,
            dateDeactivation = dateDeactivation,
            defaultBilling = defaultBilling,
            defaultShipping = defaultShipping,
            fiasIDCountry = fiasIDCountry,
            fiasIDRegion = fiasIDRegion,
            fiasIDCity = fiasIDCity,
            fiasIDArea = fiasIDArea,
            fiasIDDistrict = fiasIDDistrict,
            fiasIDHouse = fiasIDHouse,
            fiasIDStreet = fiasIDStreet,
            kladrCountry = kladrCountry,
            kladrRegion = kladrRegion,
            kladrCity = kladrCity,
            kladrArea = kladrArea,
            kladrDistrict = kladrArea,
            kladrStreet = kladrStreet,
            kladrHouse = kladrHouse,
            nameCountry = nameCountry,
            nameRegion = nameRegion,
            nameArea = nameArea,
            nameDistrict = nameDistrict,
            houseNUmber = houseNUmber,
            latitude = latitude,
            longitude = longitude
        )
    }
}