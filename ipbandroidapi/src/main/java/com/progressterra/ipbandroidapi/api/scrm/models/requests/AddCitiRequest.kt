package com.progressterra.ipbandroidapi.api.scrm.models.requests


import com.google.gson.annotations.SerializedName

data class AddCitiRequest(
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