package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

internal class LoginApiImpl : LoginApi {

    private val repository: LoginRepository = RepositoryImpl()

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse =
        repository.verificationChannelBegin(phoneNumber)

    override suspend fun addClientInfo(accessToken: String, soname: String, name: String, patronymic: String): ClientInfoResponse {
        return repository.addPersonalInfo(accessToken, soname, name, patronymic)
    }

    override suspend fun addEmail(accessToken: String, email: String): EmailResponse {
        return repository.setEmail(accessToken, email)
    }

    override suspend fun setDeviceToken(accessToken: String, deviceParameters: DeviceParameters): DeviceTokenResponse {
        return repository.setDeviceToken(accessToken, deviceParameters)
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

    override suspend fun accessToken(): String {
        return repository.getAccessToken().data
    }

    override suspend fun clientInfo(accessToken: String): ClientInfoResponse = repository.userData(accessToken)

    //    override suspend fun initClient(): InitUserResponse {
//        return repository.initClient()
//    }

    override suspend fun verificationChannelEnd(
        phoneNumber: String,
        code: String
    ): CodeVerificationModel =
        repository.verificationChannelEnd(phoneNumber, code)

    override fun getKey(): String =
        UserData.registerAccessToken

}