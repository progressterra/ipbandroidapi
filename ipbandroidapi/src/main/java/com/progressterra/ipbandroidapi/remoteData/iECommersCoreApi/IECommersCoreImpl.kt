package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ProductPageResponse

internal class IECommersCoreImpl : IECommersCore.Product {
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
}