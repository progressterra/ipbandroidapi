package com.progressterra.ipbandroidapi.api.messenger.models


import com.google.gson.annotations.SerializedName
import java.util.UUID

/**
 * 
 *
 * @param listIDClients 
 * @param description 
 * @param additionalDataJSON 
 */


data class IncomeDataForCreateDialog (

    @SerializedName("listIDClients")
    val listIDClients: List<UUID>? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null

)

