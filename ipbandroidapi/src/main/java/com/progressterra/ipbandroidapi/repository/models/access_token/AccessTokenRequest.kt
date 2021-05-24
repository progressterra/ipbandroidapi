package com.progressterra.ipbandroidapi.repository.models.access_token


import com.google.gson.annotations.SerializedName

internal data class AccessTokenRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("idClient")
    val idClient: String,
    @SerializedName("latitude")
    val latitude: Int,
    @SerializedName("longitude")
    val longitude: Int,
    @SerializedName("paramName")
    val paramName: String,
    @SerializedName("paramValue")
    val paramValue: String,
    @SerializedName("sourceQuery")
    val sourceQuery: Int
)