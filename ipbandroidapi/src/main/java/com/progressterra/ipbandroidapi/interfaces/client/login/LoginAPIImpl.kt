package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository

internal class LoginAPIImpl : LoginAPI {

    private val repository: LoginRepository = LoginRepository.getInstance()

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse {
        return repository.verificationChannelBegin(phoneNumber)
    }
}