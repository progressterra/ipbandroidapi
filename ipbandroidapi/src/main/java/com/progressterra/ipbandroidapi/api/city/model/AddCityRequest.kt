package com.progressterra.ipbandroidapi.api.city.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class AddCityRequest(
    @SerializedName("city_fias_idc")
    val cityFiasIdc: String,
    @SerializedName("city_kladr_id")
    val cityKladrId: String,
    @SerializedName("cityName")
    val cityName: String,
    @SerializedName("idrfCity")
    val idrfCity: String,
    @SerializedName("latitude")
    val latitude: Int,
    @SerializedName("longitude")
    val longitude: Int
)