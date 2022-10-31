package com.progressterra.ipbandroidapi.api.iecommerce.model


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param accessToken
 * @param idAddress
 * @param adressString
 */

data class ParamForAddAddress(

    @SerializedName("accessToken")
    val accessToken: String? = null,

    @SerializedName("idAddress")
    val idAddress: String? = null,

    @SerializedName("adressString")
    val adressString: String? = null

)

