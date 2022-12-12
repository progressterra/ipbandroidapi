package com.progressterra.ipbandroidapi.api.ambassadorinvite.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data
 */
data class ResultAmbassadorInviteData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: InviteData? = null
)