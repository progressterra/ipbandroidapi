package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel

internal interface LoginRepository {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse
    suspend fun verificationChannelEnd(phoneNumber: String, code:String) : CodeVerificationModel
}