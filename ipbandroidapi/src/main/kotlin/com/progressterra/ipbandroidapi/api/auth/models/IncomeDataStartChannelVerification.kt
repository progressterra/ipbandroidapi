package com.progressterra.ipbandroidapi.api.auth.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param phone 
 * @param accessKeyEnterprise 
 */


data class IncomeDataStartChannelVerification (

    @SerializedName("phone")
    val phone: String? = null,

    @SerializedName("accessKeyEnterprise")
    val accessKeyEnterprise: String? = null

)

