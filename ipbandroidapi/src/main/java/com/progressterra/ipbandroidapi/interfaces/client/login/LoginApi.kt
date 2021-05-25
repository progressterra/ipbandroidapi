package com.progressterra.ipbandroidapi.interfaces.client.login

interface LoginApi {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse

    companion object {
        fun newInstance(): LoginApi {
            return LoginApiImpl()
        }
    }
}