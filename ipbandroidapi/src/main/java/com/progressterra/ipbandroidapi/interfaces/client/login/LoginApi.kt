package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.InitUserResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.CitiesListResponse

interface LoginApi {

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse
    suspend fun addClientInfo(personalInfo: PersonalInfo): ResponseWrapper<BaseResponse>
    suspend fun addEmail(email: String): ResponseWrapper<BaseResponse>
    suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse>
    suspend fun addCity(city: CitiesListResponse.City): ResponseWrapper<BaseResponse>
    suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse>
    suspend fun initClient(): InitUserResponse

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