package com.progressterra.ipbandroidapi.api.messenger.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param listClients 
 * @param description 
 * @param additionalDataJSON 
 */


data class IncomeDataForCreateDialog (

    @SerializedName("listClients")
    val listClients: List<MetaDataClientWithID>? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null

)

