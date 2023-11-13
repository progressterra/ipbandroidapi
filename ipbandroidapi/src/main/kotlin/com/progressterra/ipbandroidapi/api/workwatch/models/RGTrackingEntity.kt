package com.progressterra.ipbandroidapi.api.workwatch.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param latitude 
 * @param longitude 
 */


data class RGTrackingEntity (

    @SerializedName("latitude")
    val latitude: Double? = null,

    @SerializedName("longitude")
    val longitude: Double? = null

)

