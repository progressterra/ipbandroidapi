package com.progressterra.ipbandroidapi.interfaces.client.login

interface LoginAPI {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse

    companion object {
        fun newInstance(): LoginAPI {
            return LoginAPIImpl()
        }
    }
}