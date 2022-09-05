package com.progressterra.ipbandroidapi.api.ipbpromocodeapi

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.NetworkService

internal class IPBPromoCodeImpl : IPBPromoCode.PromoCodeUse {
    private val networkService: NetworkService = NetworkService.Base()
    private val api = networkService.createService(
        IPBPromoCodeApi::class.java,
        URL.IPB_PROMOCODE_URL
    )

    override suspend fun setPromoCode(accessToken: String, promoCode: String): BaseResponse {
        return api.setPromoCode(accessToken, promoCode)
    }
}