package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel

interface LoginApi {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse


    /**
     * @param phoneNumber номер телефона без + (985...)
     * @param code введеный пользователем 4х значый код подтверждения
     */
    suspend fun verificationChannelEnd(
        phoneNumber: String,
        code: String
    ): CodeVerificationModel

    fun getKey(): String

    companion object {
        fun newInstance(): LoginApi {
            return LoginApiImpl()
        }
    }
}