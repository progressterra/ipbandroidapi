package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse

internal interface LoginRepository {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse

}