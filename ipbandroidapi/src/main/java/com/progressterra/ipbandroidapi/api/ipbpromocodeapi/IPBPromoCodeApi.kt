package com.progressterra.ipbandroidapi.api.ipbpromocodeapi

import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IPBPromoCodeApi {

    /**
     * Производится проверка на применение данного промокода (типа промокода) у клиента
     * А также конктретно на погашенность переданного промокода
     * Промокод может передавать в любом регистре
     */
    @POST("/api/v1/promocode/setpromocode/{AccessToken}/{Promocode}")
    @Headers("Content-Type: application/json")
    suspend fun setPromoCode(
        @Path("AccessToken") accessToken: String,
        @Path("Promocode") promoCode: String
    ): BaseResponse
}