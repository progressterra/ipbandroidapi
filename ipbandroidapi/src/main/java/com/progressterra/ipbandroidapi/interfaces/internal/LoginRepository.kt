package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.InitUserResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse

internal interface LoginRepository {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse
    suspend fun verificationChannelEnd(phoneNumber: String, code: String): CodeVerificationModel
    suspend fun addPersonalInfo(personalInfo: PersonalInfo): ClientInfoResponse
    suspend fun addEmail(email: String): ResponseWrapper<BaseResponse>
    suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse>
    suspend fun addCity(city: CitiesListResponse.City): ResponseWrapper<BaseResponse>
    suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse>
    suspend fun initClient(): InitUserResponse
}