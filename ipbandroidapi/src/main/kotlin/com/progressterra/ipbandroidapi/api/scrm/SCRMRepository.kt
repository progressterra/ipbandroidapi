package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.model.ClientDataIncome
import com.progressterra.ipbandroidapi.api.scrm.model.ClientFullData
import com.progressterra.ipbandroidapi.api.scrm.model.DeviceData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeChannelData
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataCreateAccessToken
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataEmail
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDataForEndLogin
import com.progressterra.ipbandroidapi.api.scrm.model.IncomeDeviceParameters


interface SCRMRepository {

    suspend fun verificationChannelBegin(request: IncomeChannelData): Result<Unit>

    suspend fun verificationChannelEnd(request: IncomeDataForEndLogin): Result<DeviceData?>

    suspend fun clientInfoByToken(
        accessToken: String,
    ): Result<ClientFullData?>

    suspend fun accessToken(request: IncomeDataCreateAccessToken): Result<String?>

    suspend fun setPersonalInfo(
        accessToken: String, request: ClientDataIncome
    ): Result<ClientFullData?>

    suspend fun setEmail(
        accessToken: String, request: IncomeDataEmail
    ): Result<Unit>

    suspend fun setDeviceToken(
        accessToken: String, request: IncomeDeviceParameters
    ): Result<Unit>
}