package com.progressterra.ipbandroidapi.api.ambassadorinvite.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param accessTokenAmbassador 
 * @param listPhones 
 */
data class IncomeDataInviteByPhone (

    @SerializedName("accessTokenAmbassador")
    val accessTokenAmbassador: String? = null,

    @SerializedName("listPhones")
    val listPhones: List<String>? = null

)

