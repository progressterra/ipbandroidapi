package com.progressterra.ipbandroidapi.api.ipbambassador.models.invite_members


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class AmbassadorInviteDataResponse(
    @SerializedName("data")
    val inviteData: InviteData? = null
) : BaseResponse() {
    data class InviteData(
        @SerializedName("promocode")
        val promocode: String? = null,
        @SerializedName("textInvite")
        val textInvite: String? = null
    )
}