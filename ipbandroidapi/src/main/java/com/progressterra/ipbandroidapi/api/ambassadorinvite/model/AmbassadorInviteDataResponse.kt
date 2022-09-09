package com.progressterra.ipbandroidapi.api.ambassadorinvite.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class AmbassadorInviteDataResponse(
    @SerializedName("data")
    val inviteData: Data? = null
) : BaseResponse() {

    data class Data(
        @SerializedName("promocode")
        val promocode: String? = null,
        @SerializedName("textInvite")
        val textInvite: String? = null
    )
}