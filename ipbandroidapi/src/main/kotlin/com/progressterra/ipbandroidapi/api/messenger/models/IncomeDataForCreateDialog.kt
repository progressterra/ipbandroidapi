package com.progressterra.ipbandroidapi.api.messenger.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param listIDClients 
 * @param description 
 * @param additionalDataJSON 
 */


data class IncomeDataForCreateDialog (

    @SerializedName("listIDClients")
    val listIDClients: List<String>? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null

)

