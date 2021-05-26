package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal class LoginApiImpl : LoginApi {

    private val repository: LoginRepository = RepositoryImpl()

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse =
        repository.verificationChannelBegin(phoneNumber)


    override suspend fun verificationChannelEnd(
        phoneNumber: String,
        code: String
    ): CodeVerificationModel =
        repository.verificationChannelEnd(phoneNumber, code)

    override fun getKey(): String =
        UserData.accessKey

}