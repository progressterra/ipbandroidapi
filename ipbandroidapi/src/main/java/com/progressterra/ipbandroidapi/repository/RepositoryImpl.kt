package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.remoteData.scrm.ScrmApi
import com.progressterra.ipbandroidapi.remoteData.scrm.models.body.VerificationRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class RepositoryImpl : LoginRepository {


    private val networkService: NetworkService = NetworkService.getInstance()

    private val scrmAPI = networkService.createService(ScrmApi::class.java)

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse {
        val response = withContext(Dispatchers.IO) {
            networkService.baseRequest {
                scrmAPI.verificationChannelBegin(
                    VerificationRequest(
                        phoneNumber
                    )
                )
            }
        }

        val errorMessage: String =
            if (response.globalResponseStatus == GlobalResponseStatus.ERROR)
                response.responseBody?.message ?: ""
            else
                ""

        return LoginResponse(
            status = response.globalResponseStatus,
            errorMessage = errorMessage
        )
    }

    override suspend fun getAccessToken(accessToken: AccessTokenRequest): Response<AccessTokenResponse> {
        return scrmAPI.getAccessToken(accessToken)
    }

    override suspend fun getGeneralInfo(accessToken: String): Response<GeneralInfoResponse> {
        return scrmAPI.getGeneralInfo(accessToken)
    }
}