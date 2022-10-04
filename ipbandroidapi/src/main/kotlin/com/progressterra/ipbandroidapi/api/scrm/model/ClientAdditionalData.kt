package com.progressterra.ipbandroidapi.api.scrm.model

data class ClientAdditionalData(
    val additionalInfo: String = "",
    val statusCompletion: Int = 0,
    val eMailGeneral: String = "",
    val phoneGeneral: String = ""
) {

    internal constructor(data: ClientAdditionalRaw) : this(
        data.additionalInfo ?: "",
        data.statusCompletion,
        data.eMailGeneral ?: "",
        data.phoneGeneral ?: ""
    )
}
