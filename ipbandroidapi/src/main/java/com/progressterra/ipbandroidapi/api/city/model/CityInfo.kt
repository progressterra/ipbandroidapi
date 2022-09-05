package com.progressterra.ipbandroidapi.api.city.model

/**
 * Data model
 */
data class CityInfo(
    val idUnique: String = "",
    val idClient: String = "",
    val dateEvent: String = "",
    val idrfCity: String = "",
    val cityName: String = "",
    val cityFiasIdc: String = "",
    val cityKladrId: String = "",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0
)
