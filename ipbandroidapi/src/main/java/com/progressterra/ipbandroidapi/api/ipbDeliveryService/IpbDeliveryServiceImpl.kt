package com.progressterra.ipbandroidapi.api.ipbDeliveryService

import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.ResultDeliveryList
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.ResultOrderStatusCreation
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.SetDeliveryTypeRequest
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.payment.RegisterOrderResponse
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class IpbDeliveryServiceImpl : IpbDeliveryService.IPBSberbank,
    IpbDeliveryService.Delivery {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val sberApi =
        networkService.createService(
            IpbDeliveryServiceApi.IPBSberbank::class.java,
            NetworkSettings.SBER_API
        )

    private val deliveryApi = networkService.createService(
        IpbDeliveryServiceApi.Delivery::class.java,
        NetworkSettings.DELIVERY_API
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

    override suspend fun getDeliveryList(accessToken: String): ResultDeliveryList {
        return deliveryApi.getDeliveryList(accessToken)
    }

    override suspend fun createDeliveryOrder(
        setDeliveryTypeRequest: SetDeliveryTypeRequest,
        accessToken: String
    ): ResultOrderStatusCreation {
        return deliveryApi.createDeliveryOrder(setDeliveryTypeRequest, accessToken)
    }
}