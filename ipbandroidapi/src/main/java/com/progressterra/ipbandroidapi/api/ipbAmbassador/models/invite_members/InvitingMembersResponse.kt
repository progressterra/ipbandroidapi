package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class InvitingMembersResponse(
    @SerializedName("data")
    val data: Data? = null,
) : BaseResponse() {
    data class Data(
        @SerializedName("listRejectedInvite")
        val listRejectedInvite: List<String>? = null,
        @SerializedName("listSuccessfulInvite")
        val listSuccessfulInvite: List<String>? = null
    )
}