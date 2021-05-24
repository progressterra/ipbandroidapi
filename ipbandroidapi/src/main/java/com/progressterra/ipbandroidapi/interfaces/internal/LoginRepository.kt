package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal interface LoginRepository {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse

    companion object {
        fun getInstance(): LoginRepository {
            return RepositoryImpl()
        }
    }
}