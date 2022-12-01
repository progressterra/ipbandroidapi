package com.progressterra.message.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idUnique 
 * @param idEnterprise 
 * @param dateCreate 
 * @param description 
 * @param additionalDataJSON 
 * @param additionalData 
 */
data class RGDialogs (

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("dateCreate")
    val dateCreate: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null,

    @SerializedName("additionalData")
    val additionalData: String? = null

)

