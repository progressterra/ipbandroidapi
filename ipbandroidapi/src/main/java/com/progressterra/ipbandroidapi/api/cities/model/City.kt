package com.progressterra.ipbandroidapi.api.cities.model

/**
* Data model
 */
data class City(
    val idUnique: String,
    val latitudeCenter: Float,
    val longitudeCenter: Float,
    val name: String,
    val radius: Int
)
