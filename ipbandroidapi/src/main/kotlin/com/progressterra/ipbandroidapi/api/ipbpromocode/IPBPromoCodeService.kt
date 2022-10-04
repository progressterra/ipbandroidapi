package com.progressterra.ipbandroidapi.api.ipbpromocode

import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5025/docsapi/v1/index.html)
 */
internal interface IPBPromoCodeService {

    @POST("/api/v1/promocode/setpromocode/{AccessToken}/{Promocode}")
    suspend fun setPromoCode(
        @Path("AccessToken") accessToken: String,
        @Path("Promocode") promoCode: String
    ): BaseResponse
}