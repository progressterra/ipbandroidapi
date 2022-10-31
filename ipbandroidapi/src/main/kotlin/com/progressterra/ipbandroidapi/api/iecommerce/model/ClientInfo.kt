package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param clientData
 * @param additionalInfo
 */
data class ClientInfo(

    @SerializedName("clientData")
    val clientData: Client? = null,

    @SerializedName("additionalInfo")
    val additionalInfo: ClientAdditionalInfo? = null

)