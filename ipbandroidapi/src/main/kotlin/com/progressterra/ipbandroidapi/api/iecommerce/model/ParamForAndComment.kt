package com.progressterra.ipbandroidapi.api.iecommerce.model


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param accessToken
 * @param comment
 */

data class ParamForAndComment(

    @SerializedName("accessToken")
    val accessToken: String? = null,

    @SerializedName("comment")
    val comment: String? = null

)

