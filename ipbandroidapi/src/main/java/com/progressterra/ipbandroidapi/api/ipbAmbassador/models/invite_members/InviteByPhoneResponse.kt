package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class InviteByPhoneResponse(
    @SerializedName("data")
    val dataInviteByPhone: DataInviteByPhone? = null,
) : BaseResponse() {
    data class DataInviteByPhone(
        @SerializedName("listRejectedInvite")
        val listRejectedInvite: List<String>? = null,
        @SerializedName("listSuccessfulInvite")
        val listSuccessfulInvite: List<String>? = null
    )
}