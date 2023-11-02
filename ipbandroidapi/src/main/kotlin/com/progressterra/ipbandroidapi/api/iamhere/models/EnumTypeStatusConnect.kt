package com.progressterra.ipbandroidapi.api.iamhere.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: WAIT,SUCCESS,REJECT
 */

enum class EnumTypeStatusConnect {

    @SerializedName("wait")
    WAIT,

    @SerializedName("success")
    SUCCESS,

    @SerializedName("reject")
    REJECT;
}

