package com.progressterra.ipbandroidapi.remoteData.ipbPromoCodeApi

import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IPBPromoCodeApi {

    @POST("/api/v1/promocode/setpromocode/{AccessToken}/{Promocode}")
    @Headers("Content-Type: application/json")
    suspend fun setPromoCode(
        @Path("AccessToken") accessToken: String,
        @Path("Promocode") promoCode: String
    ): BaseResponse
}