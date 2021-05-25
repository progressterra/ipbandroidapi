package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel

interface LoginApi {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse
    suspend fun verificationChannelEnd(phoneNumber: String, code: String): CodeVerificationModel

    companion object {
        fun newInstance(): LoginApi {
            return LoginApiImpl()
        }
    }
}