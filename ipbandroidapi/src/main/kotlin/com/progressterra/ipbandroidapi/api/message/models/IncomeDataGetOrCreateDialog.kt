package com.progressterra.ipbandroidapi.api.message.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param listID 
 * @param descriptionDialog 
 * @param additionalData 
 * @param additionalDataJSON 
 */
data class IncomeDataGetOrCreateDialog (

    @SerializedName("listID")
    val listID: List<String>? = null,

    @SerializedName("descriptionDialog")
    val descriptionDialog: String? = null,

    @SerializedName("additionalData")
    val additionalData: String? = null,

    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null
)