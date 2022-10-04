package com.progressterra.ipbandroidapi.api.city.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class CityResponse(
    @SerializedName("data") val city: Data?
) : BaseResponse() {

    data class Data(
        @SerializedName("idUnique") val idUnique: String?,
        @SerializedName("idClient") val idClient: String?,
        @SerializedName("dateEvent") val dateEvent: String?,
        @SerializedName("idrfCity") val idrfCity: String?,
        @SerializedName("cityName") val cityName: String?,
        @SerializedName("city_fias_idc") val cityFiasIdc: String?,
        @SerializedName("city_kladr_id") val cityKladrId: String?,
        @SerializedName("latitude") val latitude: Double?,
        @SerializedName("longitude") val longitude: Double?
    )
}