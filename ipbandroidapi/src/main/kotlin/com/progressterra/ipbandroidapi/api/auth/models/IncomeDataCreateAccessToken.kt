package com.progressterra.ipbandroidapi.api.auth.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param accessKey 
 * @param idDevice 
 * @param latitude 
 * @param longitude 
 */


data class IncomeDataCreateAccessToken (

    @SerializedName("accessKey")
    val accessKey: String? = null,

    @SerializedName("idDevice")
    val idDevice: String? = null,

    @SerializedName("latitude")
    val latitude: Double? = null,

    @SerializedName("longitude")
    val longitude: Double? = null

)

