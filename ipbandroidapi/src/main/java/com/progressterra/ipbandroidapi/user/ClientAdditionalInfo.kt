package com.progressterra.ipbandroidapi.user

data class ClientAdditionalInfo(
    var additionalInfo: String = "",
    var statusCompletion: Int = -1,
    var emailGeneral: String = "",
    var phoneGeneral: String = ""
)