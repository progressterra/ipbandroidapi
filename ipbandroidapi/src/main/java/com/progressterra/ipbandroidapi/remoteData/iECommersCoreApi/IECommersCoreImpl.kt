package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ImplementBonusRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ProductsInBasketResponse

internal class IECommersCoreImpl : IECommersCore.Product, IECommersCore.Cart {
    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        IECommersCoreApi::class.java,
        NetworkSettings.IECOMMERS_CORE_URL
    )

    override suspend fun getRGGoodsInventoryExtListByIds(
        accessToken: String,
        idsList: List<String>
    ): ProductPageResponse {
        return api.getProductsByIds(accessToken, idsList)
    }

    override suspend fun applyBonusesToCart(
        accessToken: String,
        bonusesQuantity: Int
    ): ProductsInBasketResponse {
        return api.implementBonus(accessToken, ImplementBonusRequest(bonusesQuantity))
    }
}