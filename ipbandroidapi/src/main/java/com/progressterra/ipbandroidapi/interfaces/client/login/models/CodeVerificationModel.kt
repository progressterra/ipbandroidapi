package com.progressterra.ipbandroidapi.interfaces.client.login.models

import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus

data class CodeVerificationModel(
    val status: GlobalResponseStatus,
    val userExist: Boolean,
    val error: String = "",
    val isDataCorrupted: Boolean
)