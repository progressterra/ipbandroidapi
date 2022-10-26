package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.ClientDataIncome
import com.progressterra.ipbandroidapi.api.scrm.model.ClientFullDataResultData
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceDataResultData
import com.progressterra.ipbandroidapi.api.scrm.model.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeChannelData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataCreateAccessToken
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataEmail
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataForEndLogin
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.model.StringResultData
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal interface SCRMCloudDataSource {

    suspend fun verificationChannelBegin(request: IncomeChannelData): EmptyResultOperationResultData

    suspend fun verificationChannelEnd(request: IncomeDataForEndLogin): DeviceDataResultData

    suspend fun clientInfoByToken(
        accessToken: String,
    ): ClientFullDataResultData

    suspend fun accessToken(request: IncomeDataCreateAccessToken): StringResultData

    suspend fun setPersonalInfo(
        accessToken: String,
        request: ClientDataIncome
    ): ClientFullDataResultData

    suspend fun setEmail(
        accessToken: String,
        request: IncomeDataEmail
    ): EmptyResultOperationResultData

    suspend fun setDeviceToken(
        accessToken: String,
        request: IncomeDeviceParameters
    ): EmptyResultOperationResultData

    class Base(
        private val service: SCRMService,
        handleException: HandleException
    ) : SCRMCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun verificationChannelBegin(request: IncomeChannelData): EmptyResultOperationResultData =
            handle {
                service.verificationChannelBegin(request)
            }

        override suspend fun verificationChannelEnd(request: IncomeDataForEndLogin): DeviceDataResultData =
            handle {
                service.verificationChannelEnd(request)
            }

        override suspend fun clientInfoByToken(accessToken: String): ClientFullDataResultData =
            handle {
                service.clientInfoByToken(accessToken)
            }

        override suspend fun accessToken(request: IncomeDataCreateAccessToken): StringResultData =
            handle {
                service.accessToken(request)
            }

        override suspend fun setPersonalInfo(
            accessToken: String,
            request: ClientDataIncome
        ): ClientFullDataResultData = handle {
            service.setPersonalInfo(accessToken, request)
        }

        override suspend fun setEmail(
            accessToken: String,
            request: IncomeDataEmail
        ): EmptyResultOperationResultData = handle {
            service.setEmail(accessToken, request)
        }

        override suspend fun setDeviceToken(
            accessToken: String,
            request: IncomeDeviceParameters
        ): EmptyResultOperationResultData = handle {
            service.setDeviceToken(accessToken, request)
        }
    }
}