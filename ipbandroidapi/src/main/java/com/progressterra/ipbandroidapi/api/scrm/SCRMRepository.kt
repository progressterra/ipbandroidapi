package com.progressterra.ipbandroidapi.api.scrm

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.model.ClientGeneralData
import com.progressterra.ipbandroidapi.api.scrm.model.VerificationType

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

    suspend fun getAccessToken(deviceId: String, latitude: Float = 0f, longitude: Float = 0f): Result<String>

    suspend fun setPersonalInfo(
        accessToken: String,
        sex: Int = 0,
        soname: String = "",
        name: String = "",
        patronymic: String = "",
        dateOfBirth: String = "",
        comment: String = ""
    ): Result<ClientGeneralData>

    suspend fun setEmail(accessToken: String, email: String): Result<Unit>

    suspend fun setDeviceToken(
        accessToken: String,
        idDevice: String,
        deviceToken: String
    ): Result<Unit>
}