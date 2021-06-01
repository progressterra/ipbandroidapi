package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.android.api.a.remoteData.scrm.models.responses.CitiesListResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal class LoginApiImpl : LoginApi {

    private val repository: LoginRepository = RepositoryImpl()

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse =
        repository.verificationChannelBegin(phoneNumber)

    override suspend fun addClientInfo(personalInfo: PersonalInfo) {
        repository.addPersonalInfo(personalInfo)
    }

    override suspend fun addEmail(email: String): ResponseWrapper<BaseResponse> {
        return repository.addEmail(email)
    }

    override suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse> {
        return repository.confirmEmail(email)
    }

    override suspend fun addCity(city: CitiesListResponse.City): ResponseWrapper<BaseResponse> {
        return repository.addCity(city)
    }

    override suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse> {
        return repository.getCitiesList()
    }


    override suspend fun verificationChannelEnd(
        phoneNumber: String,
        code: String
    ): CodeVerificationModel =
        repository.verificationChannelEnd(phoneNumber, code)

    override fun getKey(): String =
        UserData.registerAccessToken

}