package com.progressterra.ipbandroidapi.api.ambassadorinvite.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class InviteByPhoneResponse(
    @SerializedName("data")
    val dataInviteByPhone: Data? = null,
) : BaseResponse() {

    data class Data(
        @SerializedName("listRejectedInvite")
        val listRejectedInvite: List<String>? = null,
        @SerializedName("listSuccessfulInvite")
        val listSuccessfulInvite: List<String>? = null
    )
}