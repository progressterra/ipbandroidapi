package com.progressterra.ipbandroidapi.api.ipbdelivery

import com.progressterra.ipbandroidapi.api.ipbdelivery.model.*
import com.progressterra.ipbandroidapi.api.ipbdelivery.model.SetDeliveryTypeRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseIPBDeliveryRepository(
    handleException: HandleException,
    private val service: IPBDeliveryService
) : AbstractRepository(handleException), IPBDeliveryRepository {

    override suspend fun getDeliveryList(accessToken: String): Result<List<DeliveryData>> = handle {
        val response = service.getDeliveryList(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.deliveryInfoList?.map { data -> DeliveryData(data) } ?: emptyList()
    }

    override suspend fun createDeliveryOrder(
        methodType: DeliveryType,
        serviceType: ServiceType,
        rdPickUpPoint: String,
        accessToken: String
    ): Result<OrderInfoData> = handle {
        val response = service.createDeliveryOrder(
            SetDeliveryTypeRequest(
                methodType.ordinal,
                serviceType.ordinal,
                rdPickUpPoint
            ),
            accessToken
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        OrderInfoData(it.deliveryInfo)
    }

    override suspend fun getMetroStations(accessToken: String): Result<List<MetroStationsData>> = handle {
        val response = service.getMetroStations(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.metroDataList?.map { data -> MetroStationsData(data) } ?: emptyList()
    }

    override suspend fun getOrderStatus(rdOrderId: String, rfServiceType: String): Result<DeliveryStatusData> =
        handle {
            val response = service.getOrderStatus(rdOrderId, rfServiceType)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map {
            DeliveryStatusData(it.data)
        }
}