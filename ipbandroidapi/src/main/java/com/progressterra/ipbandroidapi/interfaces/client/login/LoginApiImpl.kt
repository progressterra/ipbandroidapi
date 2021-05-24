package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal class LoginApiImpl : LoginApi {

    private val repository: LoginRepository = RepositoryImpl()

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse {
        return repository.verificationChannelBegin(phoneNumber)
    }
}