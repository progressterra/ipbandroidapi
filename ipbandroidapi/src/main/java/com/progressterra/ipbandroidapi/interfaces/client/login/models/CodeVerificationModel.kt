package com.progressterra.ipbandroidapi.interfaces.client.login.models

import com.progressterra.ipbandroidapi.remotedata.models.base.GlobalResponseStatus

data class CodeVerificationModel(
    val status: GlobalResponseStatus,
    val userExist: Boolean,
    val error: String = "",
    //val isDataCorrupted: Boolean
)