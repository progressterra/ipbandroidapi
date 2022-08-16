package com.progressterra.ipbandroidapi.api.scrm.models.responses


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class CitiesListResponse(
    @SerializedName("dataList")
    val dataList: List<City>,
) : BaseResponse() {
    data class City(
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
    ) {
        override fun toString(): String {
            return this.name ?: ""
        }
    }
}