package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.*
import com.progressterra.ipbandroidapi.api.scrm.model.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.model.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.model.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceIdResponse
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.model.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.model.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.model.ClientInfoRequest
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource

interface SCRMCloudDataSource {

    suspend fun verificationChannelBegin(type: VerificationType, value: String): VerificationStartResponse

    suspend fun verificationChannelEnd(request: VerificationEndRequest): VerificationEndResponse

    suspend fun clientInfoByToken(accessToken: String): ClientInfoResponse

    suspend fun deviceIdByToken(accessToken: String): DeviceIdResponse

    suspend fun accessToken(idDevice: String): AccessTokenResponse

    suspend fun setPersonalInfo(accessToken: String, request: ClientInfoRequest): ClientInfoResponse

    suspend fun setEmail(accessToken: String, request: EmailRequest): EmailResponse

    suspend fun setDeviceToken(accessToken: String, request: DeviceParameters): DeviceTokenResponse

    class Base(
        private val service: SCRMService,
        handleException: HandleException
    ) : SCRMCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun verificationChannelBegin(type: VerificationType, value: String): VerificationStartResponse = handle {
            service.verificationChannelBegin(VerificationStartRequest(type.ordinal, value))
        }

        override suspend fun verificationChannelEnd(request: VerificationEndRequest): VerificationEndResponse = handle {
            service.verificationChannelEnd(request)
        }

        override suspend fun clientInfoByToken(accessToken: String): ClientInfoResponse = handle {
            service.clientInfoByToken(accessToken)
        }

        override suspend fun deviceIdByToken(accessToken: String): DeviceIdResponse = handle {
            service.deviceIdByToken(accessToken)
        }

        override suspend fun accessToken(idDevice: String): AccessTokenResponse = handle {
            service.accessToken(AccessTokenRequest(idDevice, 0F, 0F))
        }

        override suspend fun setPersonalInfo(accessToken: String, request: ClientInfoRequest): ClientInfoResponse = handle {
            service.setPersonalInfo(accessToken, request)
        }

        override suspend fun setEmail(accessToken: String, request: EmailRequest): EmailResponse = handle {
            service.setEmail(accessToken, request)
        }

        override suspend fun setDeviceToken(accessToken: String, request: DeviceParameters): DeviceTokenResponse = handle {
            service.setDeviceToken(accessToken, request)
        }
    }
}