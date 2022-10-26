package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

data class ClietnsAddtionalInfo (

    @SerializedName("additionalInfo")
    val additionalInfo: String? = null,

    @SerializedName("statusCompletion")
    val statusCompletion: Int? = null,

    @SerializedName("eMailGeneral")
    val eMailGeneral: String? = null,

    @SerializedName("phoneGeneral")
    val phoneGeneral: String? = null
)

