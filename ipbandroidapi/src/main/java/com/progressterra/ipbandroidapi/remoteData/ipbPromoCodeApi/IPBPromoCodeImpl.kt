package com.progressterra.ipbandroidapi.remoteData.ipbPromoCodeApi

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class IPBPromoCodeImpl : IPBPromoCode.PromoCodeUse {
    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        IPBPromoCodeApi::class.java,
        NetworkSettings.IPB_PROMOCODE_URL
    )

    override suspend fun setPromoCode(accessToken: String, promoCode: String): BaseResponse {
        return api.setPromoCode(accessToken, promoCode)
    }
}