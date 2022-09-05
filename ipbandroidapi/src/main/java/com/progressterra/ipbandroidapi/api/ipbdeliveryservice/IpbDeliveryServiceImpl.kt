package com.progressterra.ipbandroidapi.api.ipbdeliveryservice

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery.*
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.payment.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.payment.RegisterOrderResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.NetworkService

internal class IpbDeliveryServiceImpl : IpbDeliveryService.IPBSberbank,
    IpbDeliveryService.Delivery {

    private val networkService: NetworkService = NetworkService.Base()
    private val sberApi =
        networkService.createService(
            IpbDeliveryServiceApi.IPBSberbank::class.java,
            URL.SBER_API
        )

    private val deliveryApi = networkService.createService(
        IpbDeliveryServiceApi.Delivery::class.java,
        URL.DELIVERY_API
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
        accessToken: String,
        rfMethodType: DeliveryMethodType,
        rfServiceType: ServiceMethodType,
        rdPickUpPoint: String?
    ): ResultOrderStatusCreation {
        return deliveryApi.createDeliveryOrder(
            SetDeliveryTypeRequest(
                rfMethodType = rfMethodType.type,
                rfServiceType = rfServiceType.type,
                rdPickUpPoint = rdPickUpPoint
            ), accessToken
        )
    }

    override suspend fun getMetroStations(accessToken: String): MetroStationsResponse {
        return deliveryApi.getMetroStations(accessToken)
    }

    override suspend fun getOrderStatus(
        rdOrderId: String,
        rfServiceType: ServiceMethodType
    ): ResultDeliveryStatusInfo {
        return deliveryApi.getOrderStatus(
            rdOrderId = rdOrderId,
            rfServiceType = rfServiceType.type.toString()
        )
    }
}