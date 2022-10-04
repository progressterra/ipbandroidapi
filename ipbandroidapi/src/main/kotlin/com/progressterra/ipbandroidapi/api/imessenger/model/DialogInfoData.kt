package com.progressterra.ipbandroidapi.api.imessenger.model

data class DialogInfoData(
    val idEnterprise: String,
    val idUnique: String,
    val dateCreate: String,
    val description: String,
    val additionalDataJSON: String,
    val additionalData: String
) {

    internal constructor(data: DialogInfoRaw) : this(
        data.idEnterprise,
        data.idUnique,
        data.dateCreate,
        data.description ?: "",
        data.additionalDataJSON ?: "",
        data.additionalData ?: ""
    )
}