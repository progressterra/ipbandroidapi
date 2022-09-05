package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.*
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.user.SexType

interface SCRMRepository {

    suspend fun startVerificationChannel(
        type: VerificationType = VerificationType.PHONE,
        value: String = ""
    ): Result<Boolean>

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

    suspend fun setEmail(accessToken: String = "", email: String = ""): Result<Boolean>

    suspend fun setDeviceToken(
        accessToken: String = "",
        idDevice: String = "",
        deviceToken: String = ""
    ): Result<Boolean>

    class Base(
        private val sCRMCloudDataSource: SCRMCloudDataSource,
        private val sCRMCacheDataSource: SCRMCacheDataSource
    ) : SCRMRepository, AbstractRepository() {

        override suspend fun startVerificationChannel(
            type: VerificationType,
            value: String
        ): Result<Boolean> = handle {
            sCRMCloudDataSource.verificationChannelBegin(
                VerificationStartRequest(
                    type.ordinal,
                    value
                )
            )
        }.map { it.result.status == 0 }

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

        override suspend fun getAccessToken(latitude: Float, longitude: Float): Result<String> =
            handle {
                sCRMCloudDataSource.accessToken(
                    AccessTokenRequest(
                        sCRMCacheDataSource.idDevice(),
                        latitude,
                        longitude
                    )
                )
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
            sCRMCloudDataSource.setPersonalInfo(
                accessToken, ClientInfoRequest(
                    sex.ordinal, soname, name, patronymic, dateOfBirth, comment
                )
            )
        }.map {
            ClientGeneralData(
                it.data.clientInfo.toClientData(),
                it.data.clientAdditionalInfo.toClientAdditionalData()
            )
        }

        override suspend fun setEmail(accessToken: String, email: String): Result<Boolean> =
            handle {
                sCRMCloudDataSource.setEmail(accessToken, EmailRequest(email))
            }.map { it.result.status == 0 }

        override suspend fun setDeviceToken(
            accessToken: String,
            idDevice: String,
            deviceToken: String
        ): Result<Boolean> = handle {
            sCRMCloudDataSource.setDeviceToken(
                accessToken, DeviceParameters(
                    idDevice, deviceToken
                )
            )
        }.map { it.result.status == 0 }
    }
}