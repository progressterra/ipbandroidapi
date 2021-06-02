package com.progressterra.ipbandroidapi.remoteData.scrm.models.requests


import com.google.gson.annotations.SerializedName

data class ClientInfoRequest(
    @SerializedName("AccessToken")
    val accessToken: String,
    @SerializedName("ClientData")
    val clientData: ClientData,
    @SerializedName("IDClient")
    val iDClient: String,
    @SerializedName("Latitude")
    val latitude: Double,
    @SerializedName("Longitude")
    val longitude: Double,
    @SerializedName("ParamName")
    val paramName: Any?,
    @SerializedName("ParamValue")
    val paramValue: Any?,
    @SerializedName("SourceQuery")
    val sourceQuery: Int
)

