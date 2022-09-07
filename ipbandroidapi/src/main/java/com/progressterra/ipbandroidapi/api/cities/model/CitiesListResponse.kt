package com.progressterra.ipbandroidapi.api.cities.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

/**
 * API model
 */
data class CitiesListResponse(
    @SerializedName("dataList")
    val dataList: List<Data>,
) : BaseResponse() {

    data class Data(
        @SerializedName("idUnique")
        val idUnique: String,
        @SerializedName("latitudeCenter")
        val latitudeCenter: Float,
        @SerializedName("longitudeCenter")
        val longitudeCenter: Float,
        @SerializedName("name")
        val name: String?,
        @SerializedName("radius")
        val radius: Int
    )
}