package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class InfoForInvitingMembersResponse(
    @SerializedName("data")
    val data: Data? = null
) : BaseResponse() {
    data class Data(
        @SerializedName("promocode")
        val promocode: String? = null,
        @SerializedName("textInvite")
        val textInvite: String? = null
    )
}