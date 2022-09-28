package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.*
import com.progressterra.ipbandroidapi.api.scrm.model.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.model.ClientInfoRequest
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.model.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.model.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.model.VerificationStartRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.ext.format

internal class BaseSCRMRepository(
    private val sCRMCloudDataSource: SCRMCloudDataSource
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
                ClientData(it.data.client),
                ClientAdditionalData(it.data.clientAdditional)
            )
        }

    override suspend fun getDeviceIdByToken(accessToken: String): Result<String> = handle {
        val response = sCRMCloudDataSource.deviceIdByToken(accessToken)
        if (response.result.status != 0)
            throw BadRequestException()
        response
    }.map { it.deviceId }

    override suspend fun getAccessToken(deviceId: String, latitude: Float, longitude: Float): Result<String> =
        handle {
            val response = sCRMCloudDataSource.accessToken(
                AccessTokenRequest(
                    deviceId,
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
        data: ClientGeneralData
    ): Result<ClientGeneralData> = handle {
        val response = sCRMCloudDataSource.setPersonalInfo(
            accessToken, ClientInfoRequest(
                data.client.sex.ordinal,
                data.client.soname,
                data.client.name,
                data.client.patronymic,
                data.client.dateOfBirth.format(),
                data.client.comment
            )
        )
        if (response.result.status != 0)
            throw BadRequestException()
        response
    }.map {
        ClientGeneralData(
            ClientData(it.data.client),
            ClientAdditionalData(it.data.clientAdditional)
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