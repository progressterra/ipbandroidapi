package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.remotedata.models.base.GlobalResponseStatus

data class LoginResponse(
    val status: GlobalResponseStatus,
    val errorMessage: String = ""
)