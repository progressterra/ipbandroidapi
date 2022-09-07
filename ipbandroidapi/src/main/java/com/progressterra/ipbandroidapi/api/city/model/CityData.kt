package com.progressterra.ipbandroidapi.api.city.model

/**
 * Data model
 */
data class CityData(
    val idUnique: String = "",
    val idClient: String = "",
    val dateEvent: String = "",
    val idrfCity: String = "",
    val cityName: String = "",
    val cityFiasIdc: String = "",
    val cityKladrId: String = "",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0
) {

    constructor(data: CityResponse.Data) : this(
        data.idUnique ?: "",
        data.idClient ?: "",
        data.dateEvent ?: "",
        data.idrfCity ?: "",
        data.cityName ?: "",
        data.cityFiasIdc ?: "",
        data.cityKladrId ?: "",
        data.latitude ?: 0.0,
        data.longitude ?: 0.0
    )
}
