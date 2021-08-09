package com.progressterra.ipbandroidapi.remoteData.scrm.models.address


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.interfaces.client.addresses.AddressUI
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ListOfAddressesResponse(
    @SerializedName("data")
    val addressInfo: MainInfoAboutAddress,
) : BaseResponse() {
    fun convertToUiModel(): List<AddressUI> {
        val defaultShippingAddressId = addressInfo.defaultShippingAddress?.idUnique
        val defaultBillingAddressId = addressInfo.defaultBillingAddress?.idUnique
        val convertedAddresses = mutableListOf<AddressUI>()

        addressInfo.listAddress?.map {
            convertedAddresses.add(
                AddressUI(
                    idUnique = it.idUnique,
                    nameCity = it.nameCity,
                    postalCode = it.postalCode,
                    building = it.building,
                    apartment = it.apartment,
                    floor = it.floor,
                    nameStreet = it.nameStreet,
                    entrance = it.entrance,
                    isDefaultShippingAddress = it.idUnique == defaultShippingAddressId,
                    isDefaultBillingAddress = it.idUnique == defaultBillingAddressId,
                    idClient = it.idClient,
                    dateAdded = it.dateAdded,
                    dateVerification = it.dateVerification,
                    idManagerVerification = it.idManagerVerification,
                    dateDeactivation = it.dateDeactivation,
                    defaultBilling = it.defaultBilling,
                    defaultShipping = it.defaultShipping,
                    fiasIDCountry = it.fiasIDCountry,
                    fiasIDRegion = it.fiasIDRegion,
                    fiasIDCity = it.fiasIDCity,
                    fiasIDArea = it.fiasIDArea,
                    fiasIDDistrict = it.fiasIDDistrict,
                    fiasIDHouse = it.fiasIDHouse,
                    fiasIDStreet = it.fiasIDStreet,
                    kladrCountry = it.kladrCountry,
                    kladrRegion = it.kladrRegion,
                    kladrCity = it.kladrCity,
                    kladrArea = it.kladrArea,
                    kladrDistrict = it.kladrArea,
                    kladrStreet = it.kladrStreet,
                    kladrHouse = it.kladrHouse,
                    nameCountry = it.nameCountry,
                    nameRegion = it.nameRegion,
                    nameArea = it.nameArea,
                    nameDistrict = it.nameDistrict,
                    houseNUmber = it.houseNUmber,
                    latitude = it.latitude,
                    longitude = it.longitude
                )
            )
        }

        return convertedAddresses
    }
}