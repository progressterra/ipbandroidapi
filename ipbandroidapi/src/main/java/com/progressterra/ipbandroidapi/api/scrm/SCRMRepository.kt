package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.*
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface SCRMRepository {

    suspend fun startVerificationChannel(
        type: VerificationType,
        value: String
    ): VerificationStartResponse

    suspend fun finishVerificationChannel(request: VerificationEndRequest): Result<String>

    suspend fun getClientInfoByToken(accessToken: String): Result<ClientGeneralData>

    suspend fun getDeviceIdByToken(accessToken: String): Result<String>

    suspend fun getAccessToken(): Result<String>

    suspend fun setPersonalInfo(
        accessToken: String,
        request: ClientInfoRequest
    ): Result<ClientGeneralData>

    suspend fun setEmail(accessToken: String, request: EmailRequest): Result<Boolean>

    suspend fun setDeviceToken(accessToken: String, request: DeviceParameters): Result<Boolean>

    class Base(
        private val sCRMCloudDataSource: SCRMCloudDataSource,
        private val sCRMCacheDataSource: SCRMCacheDataSource
    ) : SCRMRepository, AbstractRepository() {

        override suspend fun startVerificationChannel(
            type: VerificationType,
            value: String
        ): VerificationStartResponse =
            sCRMCloudDataSource.verificationChannelBegin(type, value)

        override suspend fun finishVerificationChannel(request: VerificationEndRequest): Result<String> =
            handle {
                val response = sCRMCloudDataSource.verificationChannelEnd(request)
                sCRMCacheDataSource.saveIdDevice(response.data.idDevice)
                response
            }.map { response -> response.data.idDevice }

        override suspend fun getClientInfoByToken(accessToken: String): Result<ClientGeneralData> =
            handle {
                sCRMCloudDataSource.clientInfoByToken(accessToken)
            }.map {
                ClientGeneralData(
                    it.data.clientInfo.toClientData(),
                    it.data.clientAdditionalInfo.toClientAdditionalData()
                )
            }

        override suspend fun getDeviceIdByToken(accessToken: String): Result<String> = handle {
            sCRMCloudDataSource.deviceIdByToken(accessToken)
        }.map { it.deviceId }

        override suspend fun getAccessToken(): Result<String> = handle {
            sCRMCloudDataSource.accessToken(sCRMCacheDataSource.idDevice())
        }.map { it.data }

        override suspend fun setPersonalInfo(
            accessToken: String,
            request: ClientInfoRequest
        ): Result<ClientGeneralData> = handle {
            sCRMCloudDataSource.setPersonalInfo(accessToken, request)
        }.map {
            ClientGeneralData(
                it.data.clientInfo.toClientData(),
                it.data.clientAdditionalInfo.toClientAdditionalData()
            )
        }

        override suspend fun setEmail(accessToken: String, request: EmailRequest): Result<Boolean> =
            handle {
                sCRMCloudDataSource.setEmail(accessToken, request)
            }.map { it.result.status == 0 }

        override suspend fun setDeviceToken(
            accessToken: String,
            request: DeviceParameters
        ): Result<Boolean> = handle {
            sCRMCloudDataSource.setDeviceToken(accessToken, request)
        }.map { it.result.status == 0 }
    }
}