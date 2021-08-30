package com.progressterra.ipbandroidapi.remoteData.ipbCollaborationCoreApi

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ProductsInBasketResponse
import retrofit2.Response

internal class IPBCollaborationCoreImpl : IPBCollaborationCore.Cart {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val api =
        networkService.createService(
            IPBCollaborationCoreApi::class.java,
            NetworkSettings.COLLABORATION_CORE_URL
        )

    override suspend fun applyBonusesToCart(
        accessToken: String,
        bonusesQuantity: Int
    ): ProductsInBasketResponse {
        return api.applyBonusesForCart(bonusesQuantity.toString(), accessToken)
    }

    override suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse {
        return api.confirmOrder(accessToken)
    }
}