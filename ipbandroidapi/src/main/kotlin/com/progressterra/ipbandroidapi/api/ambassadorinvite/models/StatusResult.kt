package com.progressterra.ipbandroidapi.api.ambassadorinvite.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: ZERO,ONE,TWO,_3
 */
enum class StatusResult {

    @SerializedName("0")
    ZERO,
    @SerializedName("1")
    ONE,
    @SerializedName("2")
    TWO,
    @SerializedName("3")
    THREE
}