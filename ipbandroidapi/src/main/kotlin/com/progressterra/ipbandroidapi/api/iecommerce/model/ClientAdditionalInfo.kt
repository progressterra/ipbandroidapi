package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param additionalInfo
 * @param statusCompletion
 * @param eMailGeneral
 * @param phoneGeneral
 */
data class ClientAdditionalInfo(

    @SerializedName("additionalInfo")
    val additionalInfo: String? = null,

    @SerializedName("statusCompletion")
    val statusCompletion: Long? = null,

    @SerializedName("eMailGeneral")
    val eMailGeneral: String? = null,

    @SerializedName("phoneGeneral")
    val phoneGeneral: String? = null

)

