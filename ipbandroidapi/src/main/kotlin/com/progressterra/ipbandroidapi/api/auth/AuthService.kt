package com.progressterra.ipbandroidapi.api.auth

import com.progressterra.ipbandroidapi.api.auth.models.DeviceDataResultData
import com.progressterra.ipbandroidapi.api.auth.models.IncomeDataCreateAccessToken
import com.progressterra.ipbandroidapi.api.auth.models.IncomeDataEndChannelVerificationForAT
import com.progressterra.ipbandroidapi.api.auth.models.IncomeDataStartChannelVerification
import com.progressterra.ipbandroidapi.api.auth.models.ResultSendCodeForClientResultData
import com.progressterra.ipbandroidapi.api.auth.models.StringResultData
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("/authbyaccesskey/login/start")
    suspend fun loginStart(
        @Body body: IncomeDataStartChannelVerification
    ) : ResultSendCodeForClientResultData

    @POST("/authbyaccesskey/login/end")
    suspend fun loginEnd(
        @Body body: IncomeDataEndChannelVerificationForAT
    ) : DeviceDataResultData

    @POST("/authbyaccesskey/accesstoken")
    suspend fun accessToken(
        @Body body: IncomeDataCreateAccessToken
    ) : StringResultData
}