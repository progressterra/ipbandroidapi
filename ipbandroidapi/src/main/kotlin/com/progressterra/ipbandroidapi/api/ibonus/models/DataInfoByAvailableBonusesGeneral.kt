package com.progressterra.ipbandroidapi.api.ibonus.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param typeBonusName 
 * @param currentQuantity 
 * @param forBurningQuantity 
 * @param dateBurning 
 */
data class DataInfoByAvailableBonusesGeneral (

    @SerializedName("typeBonusName")
    val typeBonusName: String? = null,

    @SerializedName("currentQuantity")
    val currentQuantity: Double? = null,

    @SerializedName("forBurningQuantity")
    val forBurningQuantity: Double? = null,

    @SerializedName("dateBurning")
    val dateBurning: String? = null

)

