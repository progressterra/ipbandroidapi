package com.progressterra.ipbandroidapi.api.balance

import com.progressterra.ipbandroidapi.api.balance.models.RGMoveDataEntityAmountResultData
import com.progressterra.ipbandroidapi.api.balance.models.RGMoveDataEntityBase
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface BalanceService {

    @GET("/balance/client")
    suspend fun client(): RGMoveDataEntityAmountResultData

    @POST("/balance")
    suspend fun balance(
        @Body income: RGMoveDataEntityBase
    ): RGMoveDataEntityAmountResultData
}