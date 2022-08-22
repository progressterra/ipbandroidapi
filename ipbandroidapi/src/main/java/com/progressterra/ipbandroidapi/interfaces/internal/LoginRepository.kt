package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.InitUserResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse

internal interface LoginRepository {

    suspend fun setDeviceToken(accessToken: String, deviceParameters: DeviceParameters): DeviceTokenResponse
    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse
    suspend fun verificationChannelEnd(phoneNumber: String, code: String): CodeVerificationModel
    suspend fun getAccessToken(): AccessTokenResponse
    suspend fun userData(accessToken: String) : ClientInfoResponse
    suspend fun addPersonalInfo(accessToken: String, soname: String, name: String, patronymic: String): ClientInfoResponse
    suspend fun setEmail(accessToken: String, email: String): EmailResponse
    suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse>
    suspend fun addCity(city: CitiesListResponse.City): ResponseWrapper<BaseResponse>
    suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse>
    //suspend fun initClient(): InitUserResponse
}