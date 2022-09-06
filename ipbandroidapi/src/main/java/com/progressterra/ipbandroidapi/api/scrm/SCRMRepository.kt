package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.*
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.user.SexType

interface SCRMRepository {

    suspend fun startVerificationChannel(
        type: VerificationType = VerificationType.PHONE,
        value: String = ""
    ): Result<Unit>

    suspend fun finishVerificationChannel(
        type: VerificationType = VerificationType.PHONE,
        value: String = "",
        code: String = "",
        infoDevice: String = ""
    ): Result<String>

    suspend fun getClientInfoByToken(accessToken: String = ""): Result<ClientGeneralData>

    suspend fun getDeviceIdByToken(accessToken: String = ""): Result<String>

    suspend fun getAccessToken(latitude: Float = 0f, longitude: Float = 0f): Result<String>

    suspend fun setPersonalInfo(
        accessToken: String = "",
        sex: SexType = SexType.NONE,
        soname: String = "",
        name: String = "",
        patronymic: String = "",
        dateOfBirth: String = "",
        comment: String = ""
    ): Result<ClientGeneralData>

    suspend fun setEmail(accessToken: String = "", email: String = ""): Result<Unit>

    suspend fun setDeviceToken(
        accessToken: String = "",
        idDevice: String = "",
        deviceToken: String = ""
    ): Result<Unit>

    class Base(
        private val sCRMCloudDataSource: SCRMCloudDataSource,
        private val sCRMCacheDataSource: SCRMCacheDataSource
    ) : SCRMRepository, AbstractRepository() {

        override suspend fun startVerificationChannel(
            type: VerificationType,
            value: String
        ): Result<Unit> = handle {
            val response = sCRMCloudDataSource.verificationChannelBegin(
                VerificationStartRequest(
                    type.ordinal,
                    value
                )
            )
            if (response.result.status != 0)
                throw BadRequestException()
        }

        override suspend fun finishVerificationChannel(
            type: VerificationType,
            value: String,
            code: String,
            infoDevice: String
        ): Result<String> =
            handle {
                val response = sCRMCloudDataSource.verificationChannelEnd(
                    VerificationEndRequest(
                        type.ordinal,
                        value,
                        code,
                        infoDevice
                    )
                )
                if (response.result.status != 0)
                    throw BadRequestException()
                sCRMCacheDataSource.saveIdDevice(response.data.idDevice)
                response
            }.map { response -> response.data.idDevice }

        override suspend fun getClientInfoByToken(accessToken: String): Result<ClientGeneralData> =
            handle {
                val response = sCRMCloudDataSource.clientInfoByToken(accessToken)
                if (response.result.status != 0)
                    throw BadRequestException()
                response
            }.map {
                ClientGeneralData(
                    it.data.clientInfo.toClientData(),
                    it.data.clientAdditionalInfo.toClientAdditionalData()
                )
            }

        override suspend fun getDeviceIdByToken(accessToken: String): Result<String> = handle {
            val response = sCRMCloudDataSource.deviceIdByToken(accessToken)
            if (response.result.status != 0)
                throw BadRequestException()
            response
        }.map { it.deviceId }

        override suspend fun getAccessToken(latitude: Float, longitude: Float): Result<String> =
            handle {
                val response = sCRMCloudDataSource.accessToken(
                    AccessTokenRequest(
                        sCRMCacheDataSource.idDevice(),
                        latitude,
                        longitude
                    )
                )
                if (response.result.status != 0)
                    throw BadRequestException()
                response
            }.map { it.data }

        override suspend fun setPersonalInfo(
            accessToken: String,
            sex: SexType,
            soname: String,
            name: String,
            patronymic: String,
            dateOfBirth: String,
            comment: String
        ): Result<ClientGeneralData> = handle {
            val response = sCRMCloudDataSource.setPersonalInfo(
                accessToken, ClientInfoRequest(
                    sex.ordinal, soname, name, patronymic, dateOfBirth, comment
                )
            )
            if (response.result.status != 0)
                throw BadRequestException()
            response
        }.map {
            ClientGeneralData(
                it.data.clientInfo.toClientData(),
                it.data.clientAdditionalInfo.toClientAdditionalData()
            )
        }

        override suspend fun setEmail(accessToken: String, email: String): Result<Unit> =
            handle {
                val response = sCRMCloudDataSource.setEmail(accessToken, EmailRequest(email))
                if (response.result.status != 0)
                    throw BadRequestException()
            }

        override suspend fun setDeviceToken(
            accessToken: String,
            idDevice: String,
            deviceToken: String
        ): Result<Unit> = handle {
            val response = sCRMCloudDataSource.setDeviceToken(
                accessToken, DeviceParameters(
                    idDevice, deviceToken
                )
            )
            if (response.result.status != 0)
                throw BadRequestException()
        }
    }
}