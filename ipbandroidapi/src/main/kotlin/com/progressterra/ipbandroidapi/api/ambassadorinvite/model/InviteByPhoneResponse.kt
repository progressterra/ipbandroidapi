package com.progressterra.ipbandroidapi.api.ambassadorinvite.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class InviteByPhoneResponse(
    @SerializedName("data")
    val dataInviteByPhone: Data?,
) : BaseResponse() {

    data class Data(
        @SerializedName("listRejectedInvite")
        val listRejectedInvite: List<String>?,
        @SerializedName("listSuccessfulInvite")
        val listSuccessfulInvite: List<String>?
    )
}