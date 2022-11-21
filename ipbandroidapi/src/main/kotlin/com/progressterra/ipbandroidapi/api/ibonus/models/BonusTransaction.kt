package com.progressterra.ipbandroidapi.api.ibonus.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param typeBonusName 
 * @param dateEvent 
 * @param typeOperation 
 * @param quantity 
 */
data class BonusTransaction (

    @SerializedName("typeBonusName")
    val typeBonusName: String? = null,

    @SerializedName("dateEvent")
    val dateEvent: String? = null,

    @SerializedName("typeOperation")
    val typeOperation: Int? = null,

    @SerializedName("quantity")
    val quantity: Double? = null

)

