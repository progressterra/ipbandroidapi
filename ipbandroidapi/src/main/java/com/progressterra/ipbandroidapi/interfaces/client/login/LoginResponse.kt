package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus

data class LoginResponse(
    val status: GlobalResponseStatus,
    val errorMessage: String = ""
)