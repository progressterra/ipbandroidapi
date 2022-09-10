package com.progressterra.ipbandroidapi.api.ambassadorinvite.model

data class InvitedData(
    val listRejectedInvite: List<String>,
    val listSuccessfulInvite: List<String>
) {

    internal constructor(data: InviteByPhoneResponse.Data?) : this(
        data?.listRejectedInvite ?: emptyList(),
        data?.listSuccessfulInvite ?: emptyList()
    )
}
