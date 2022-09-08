package com.progressterra.ipbandroidapi.api.ambassador.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

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