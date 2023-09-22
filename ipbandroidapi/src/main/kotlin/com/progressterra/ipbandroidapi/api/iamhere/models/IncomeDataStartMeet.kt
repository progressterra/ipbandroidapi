package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 * Параметры для начала общения
 *
 * @param geoDataEnity 
 * @param target 
 */


data class IncomeDataStartMeet (

    @SerializedName("geoDataEnity")
    val geoDataEnity: GeoData? = null,

    @SerializedName("target")
    val target: RFTargetViewModel? = null

)

