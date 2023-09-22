package com.progressterra.ipbandroidapi.api.iamhere.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param latitude 
 * @param longitude 
 */


data class GeoPoint (

    @SerializedName("latitude")
    val latitude: Double? = null,

    @SerializedName("longitude")
    val longitude: Double? = null

)

