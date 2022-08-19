package com.progressterra.ipbandroidapi.interfaces.client.login

import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse

interface LoginApi {

    suspend fun clientInfo(accessToken: String): ClientInfoResponse

    suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse

    suspend fun addClientInfo(accessToken: String, soname: String, name: String, patronymic: String): ClientInfoResponse

    suspend fun addEmail(accessToken: String, email: String): EmailResponse

    suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse>

    suspend fun addCity(city: CitiesListResponse.City): ResponseWrapper<BaseResponse>

    suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse>

    //suspend fun initClient(): InitUserResponse

    /**
     * @param phoneNumber номер телефона без + (985...)
     * @param code введеный пользователем 4х значый код подтверждения
     */
    suspend fun verificationChannelEnd(phoneNumber: String, code: String): CodeVerificationModel

    fun getKey(): String

    companion object {
        fun newInstance(): LoginApi {
            return LoginApiImpl()
        }
    }
}