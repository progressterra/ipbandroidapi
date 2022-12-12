package com.progressterra.ipbandroidapi.api.ambassadorinvite.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param listSuccessfulInvite 
 * @param listRejectedInvite 
 */
data class DataInviteByPhone (

    @SerializedName("listSuccessfulInvite")
    val listSuccessfulInvite: List<String>? = null,

    @SerializedName("listRejectedInvite")
    val listRejectedInvite: List<String>? = null

)