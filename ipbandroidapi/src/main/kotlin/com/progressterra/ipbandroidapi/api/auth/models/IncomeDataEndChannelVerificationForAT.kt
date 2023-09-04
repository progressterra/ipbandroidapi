package com.progressterra.ipbandroidapi.api.auth.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param tempToken 
 * @param codeFromSMS 
 * @param infoDevice 
 */


data class IncomeDataEndChannelVerificationForAT (

    @SerializedName("tempToken")
    val tempToken: String? = null,

    @SerializedName("codeFromSMS")
    val codeFromSMS: String? = null,

    @SerializedName("infoDevice")
    val infoDevice: String? = null

)

