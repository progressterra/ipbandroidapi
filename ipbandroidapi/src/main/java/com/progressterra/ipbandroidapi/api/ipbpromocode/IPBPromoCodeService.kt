package com.progressterra.ipbandroidapi.api.ipbpromocode

import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.POST
import retrofit2.http.Path

interface IPBPromoCodeService {

    @POST("/api/v1/promocode/setpromocode/{AccessToken}/{Promocode}")
    suspend fun setPromoCode(
        @Path("AccessToken") accessToken: String,
        @Path("Promocode") promoCode: String
    ): BaseResponse
}