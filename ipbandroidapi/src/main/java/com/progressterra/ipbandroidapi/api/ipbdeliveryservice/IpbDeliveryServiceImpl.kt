package com.progressterra.ipbandroidapi.api.ipbdeliveryservice

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery.*
import com.progressterra.ipbandroidapi.core.NetworkService

internal class IpbDeliveryServiceImpl :
    IpbDeliveryService.Delivery {

    private val networkService: NetworkService = NetworkService.Base()


    private val deliveryApi = networkService.createService(
        IpbDeliveryServiceApi.Delivery::class.java,
        URL.DELIVERY_API
    )



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