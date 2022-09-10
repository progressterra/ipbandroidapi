package com.progressterra.ipbandroidapi.api.city.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class CityResponse(
    @SerializedName("data") val city: Data? = null
) : BaseResponse() {

    data class Data(
        @SerializedName("idUnique") val idUnique: String? = null,
        @SerializedName("idClient") val idClient: String? = null,
        @SerializedName("dateEvent") val dateEvent: String? = null,
        @SerializedName("idrfCity") val idrfCity: String? = null,
        @SerializedName("cityName") val cityName: String? = null,
        @SerializedName("city_fias_idc") val cityFiasIdc: String? = null,
        @SerializedName("city_kladr_id") val cityKladrId: String? = null,
        @SerializedName("latitude") val latitude: Double? = null,
        @SerializedName("longitude") val longitude: Double? = null
    )
}