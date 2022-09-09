package com.progressterra.ipbandroidapi.api.ambassadorinvite.model

data class AmbassadorInviteData(
    val promocode: String,
    val textInvite: String
) {

    constructor(data: AmbassadorInviteDataResponse.Data?) : this(
        data?.promocode ?: "",
        data?.textInvite ?: ""
    )
}
