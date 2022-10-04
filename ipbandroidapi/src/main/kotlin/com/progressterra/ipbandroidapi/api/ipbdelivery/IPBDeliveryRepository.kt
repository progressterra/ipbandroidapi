package com.progressterra.ipbandroidapi.api.ipbdelivery

import com.progressterra.ipbandroidapi.api.ipbdelivery.model.*

interface IPBDeliveryRepository {

    suspend fun getDeliveryList(accessToken: String): Result<List<DeliveryData>>

    suspend fun createDeliveryOrder(
        methodType: DeliveryType,
        serviceType: ServiceType,
        rdPickUpPoint: String,
        accessToken: String
    ): Result<OrderInfoData>

    suspend fun getMetroStations(accessToken: String): Result<List<MetroStationsData>>

    suspend fun getOrderStatus(rdOrderId: String, rfServiceType: String): Result<DeliveryStatusData>
}