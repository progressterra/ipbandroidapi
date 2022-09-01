package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.deviceid.DeviceIdResponse
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.models.requests.ClientInfoRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationType

interface SCRMRepository {

    suspend fun startVerificationChannel(
        type: VerificationType,
        value: String
    ): VerificationStartResponse

    suspend fun finishVerificationChannel(request: VerificationEndRequest): VerificationEndResponse

    suspend fun getClientInfoByToken(accessToken: String): ClientInfoResponse

    suspend fun getDeviceIdByToken(accessToken: String): DeviceIdResponse

    suspend fun getAccessToken(): AccessTokenResponse

    suspend fun setPersonalInfo(accessToken: String, request: ClientInfoRequest): ClientInfoResponse

    suspend fun setEmail(accessToken: String, request: EmailRequest): EmailResponse

    suspend fun setDeviceToken(accessToken: String, request: DeviceParameters): DeviceTokenResponse

    class Base(
        private val sCRMCloudDataSource: SCRMCloudDataSource,
        private val sCRMCacheDataSource: SCRMCacheDataSource
    ) : SCRMRepository {

        override suspend fun startVerificationChannel(
            type: VerificationType,
            value: String
        ): VerificationStartResponse =
            sCRMCloudDataSource.verificationChannelBegin(type, value)

        override suspend fun finishVerificationChannel(request: VerificationEndRequest): VerificationEndResponse {
            val response = sCRMCloudDataSource.verificationChannelEnd(request)
            sCRMCacheDataSource.saveIdDevice(response.data.idDevice)
            return response
        }

        override suspend fun getClientInfoByToken(accessToken: String): ClientInfoResponse =
            sCRMCloudDataSource.clientInfoByToken(accessToken)

        override suspend fun getDeviceIdByToken(accessToken: String): DeviceIdResponse =
            sCRMCloudDataSource.deviceIdByToken(accessToken)

        override suspend fun getAccessToken(): AccessTokenResponse =
            sCRMCloudDataSource.accessToken(sCRMCacheDataSource.idDevice())

        override suspend fun setPersonalInfo(
            accessToken: String,
            request: ClientInfoRequest
        ): ClientInfoResponse =
            sCRMCloudDataSource.setPersonalInfo(accessToken, request)

        override suspend fun setEmail(accessToken: String, request: EmailRequest): EmailResponse =
            sCRMCloudDataSource.setEmail(accessToken, request)

        override suspend fun setDeviceToken(
            accessToken: String,
            request: DeviceParameters
        ): DeviceTokenResponse =
            sCRMCloudDataSource.setDeviceToken(accessToken, request)
    }
}