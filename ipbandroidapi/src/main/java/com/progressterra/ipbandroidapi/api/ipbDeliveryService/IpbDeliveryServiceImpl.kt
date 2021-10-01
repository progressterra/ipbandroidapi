package com.progressterra.ipbandroidapi.api.ipbDeliveryService

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.RegisterOrderResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class IpbDeliveryServiceImpl : IpbDeliveryService.IPBSberbank {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val sberApi =
        networkService.createService(
            IpbDeliveryServiceApi::class.java,
            NetworkSettings.SBER_API
        )

    override suspend fun registerOrder(idDHSaleHead: String): RegisterOrderResponse {
        return sberApi.registerOrder(idDHSaleHead)
    }

    override suspend fun sendCardData(idDHSaleHead: String, seToken: String): BaseResponse {
        return sberApi.sendCardData(idDHSaleHead, seToken)
    }

    override suspend fun getOrderStatus(idDHSaleHead: String): GetOrderStatusResponse {
        return sberApi.getOrderStatus(idDHSaleHead)
    }
}