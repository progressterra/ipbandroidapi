package com.progressterra.message.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idrgDialog 
 * @param accessToken 
 * @param contentText 
 */
data class IncomeMessagesTextData (

    @SerializedName("idrgDialog")
    val idrgDialog: String? = null,

    @SerializedName("accessToken")
    val accessToken: String? = null,

    @SerializedName("contentText")
    val contentText: String? = null
)