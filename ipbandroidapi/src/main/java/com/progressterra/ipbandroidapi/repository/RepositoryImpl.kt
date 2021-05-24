package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.internal.BonusesRepository
import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.ScrmApi
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.AccessTokenRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.VerificationRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.GeneralInfoResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class RepositoryImpl : LoginRepository, BonusesRepository {


    private val networkService: NetworkService = NetworkServiceImpl()

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

    override suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse> {
//             временное решение, после будет глобальная инициализация где будут эти параметры получать
        val accessTokenRequest = AccessTokenRequest(
            "",
            idClient = "2c44d8c2-c89a-472e-aab3-9a8a29142315",
            0,
            0,
            "device",
            paramValue = "7db72635-fd0a-46b9-813b-1627e3aa02ea",
            0
        )
        return networkService.baseRequest { scrmAPI.getAccessToken(accessTokenRequest) }
    }

    override suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse> {
        return networkService.baseRequest { scrmAPI.getGeneralInfo(accessToken) }
    }
}