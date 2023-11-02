package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param name 
 * @param interestType 
 */


data class RFInterestEntity (

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("interestType")
    val interestType: TypeInterest? = null

)

