package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.ClientDataIncome
import com.progressterra.ipbandroidapi.api.scrm.model.ClientFullData
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeChannelData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataCreateAccessToken
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataEmail
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataForEndLogin
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDeviceParameters
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseSCRMRepository(
    private val cloudDataSource: SCRMCloudDataSource
) : SCRMRepository {

    override suspend fun verificationChannelBegin(request: IncomeChannelData): Result<Unit> =
        runCatching {
            val response = cloudDataSource.verificationChannelBegin(request)
            if (response.result?.status != 0)
                throw BadRequestException()
        }

    override suspend fun verificationChannelEnd(request: IncomeDataForEndLogin): Result<DeviceData?> =
        runCatching {
            val response = cloudDataSource.verificationChannelEnd(request)
            if (response.result?.status != 0)
                throw BadRequestException()
            response.data
        }

    override suspend fun clientInfoByToken(accessToken: String): Result<ClientFullData?> =
        runCatching {
            val response = cloudDataSource.clientInfoByToken(accessToken)
            if (response.result?.status != 0)
                throw BadRequestException()
            response.data
        }

    override suspend fun accessToken(request: IncomeDataCreateAccessToken): Result<String?> =
        runCatching {
            val response = cloudDataSource.accessToken(request)
            if (response.result?.status != 0)
                throw BadRequestException()
            response.data
        }

    override suspend fun setPersonalInfo(
        accessToken: String,
        request: ClientDataIncome
    ): Result<ClientFullData?> = runCatching {
        val response = cloudDataSource.setPersonalInfo(accessToken, request)
        if (response.result?.status != 0)
            throw BadRequestException()
        response.data
    }

    override suspend fun setEmail(accessToken: String, request: IncomeDataEmail): Result<Unit> =
        runCatching {
            val response = cloudDataSource.setEmail(accessToken, request)
            if (response.result?.status != 0)
                throw BadRequestException()
        }

    override suspend fun setDeviceToken(
        accessToken: String,
        request: IncomeDeviceParameters
    ): Result<Unit> = runCatching {
        val response = cloudDataSource.setDeviceToken(accessToken, request)
        if (response.result?.status != 0)
            throw BadRequestException()
    }
}