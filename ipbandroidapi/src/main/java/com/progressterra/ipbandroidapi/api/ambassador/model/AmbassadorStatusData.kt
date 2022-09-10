package com.progressterra.ipbandroidapi.api.ambassador.model

data class AmbassadorStatusData(
    val dataAmbassador: AmbassadorDetailsData,
    val message: String,
    val statusText: String,
    val statusWork: Int
) {

    internal constructor(data: AmbassadorStatusResponse.Data?) : this(
        AmbassadorDetailsData(data?.dataAmbassador),
        data?.message ?: "",
        data?.statusText ?: "",
        data?.statusWork ?: 0
    )
}
