package com.progressterra.ipbandroidapi.api.cities.model

/**
 * Data model
 */
data class CityData(
    val idUnique: String,
    val latitudeCenter: Float,
    val longitudeCenter: Float,
    val name: String,
    val radius: Int
) {

    constructor(data: CitiesListResponse.Data) : this(
        data.idUnique,
        data.latitudeCenter,
        data.longitudeCenter,
        data.name ?: "",
        data.radius
    )
}
