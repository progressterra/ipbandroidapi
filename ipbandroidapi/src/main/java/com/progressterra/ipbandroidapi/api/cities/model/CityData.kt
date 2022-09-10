package com.progressterra.ipbandroidapi.api.cities.model

data class CityData(
    val idUnique: String,
    val latitudeCenter: Float,
    val longitudeCenter: Float,
    val name: String,
    val radius: Int
) {

    internal constructor(data: CitiesListResponse.Data) : this(
        data.idUnique,
        data.latitudeCenter,
        data.longitudeCenter,
        data.name ?: "",
        data.radius
    )
}
