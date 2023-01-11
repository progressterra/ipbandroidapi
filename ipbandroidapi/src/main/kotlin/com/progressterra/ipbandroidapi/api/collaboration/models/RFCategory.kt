package com.progressterra.ipbandroidapi.api.collaboration.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param idParentEnterprise
 * @param description
 * @param urlImage
 */


data class RFCategory(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idParentEnterprise")
    val idParentEnterprise: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("urlImage")
    val urlImage: String? = null

)

