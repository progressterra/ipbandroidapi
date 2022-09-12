package com.progressterra.ipbandroidapi.api.ambassadorinvite.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class AmbassadorInviteDataResponse(
    @SerializedName("data")
    val inviteData: Data?
) : BaseResponse() {

    data class Data(
        @SerializedName("promocode")
        val promocode: String?,
        @SerializedName("textInvite")
        val textInvite: String?
    )
}