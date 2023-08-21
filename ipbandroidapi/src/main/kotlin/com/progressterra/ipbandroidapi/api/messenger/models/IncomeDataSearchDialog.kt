package com.progressterra.ipbandroidapi.api.messenger.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param listIDClients 
 */


data class IncomeDataSearchDialog (

    @SerializedName("listIDClients")
    val listIDClients: List<String>? = null

)

