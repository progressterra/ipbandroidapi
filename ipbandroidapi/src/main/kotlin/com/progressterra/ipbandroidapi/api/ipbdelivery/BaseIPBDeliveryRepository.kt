package com.progressterra.ipbandroidapi.api.ipbdelivery

import com.progressterra.ipbandroidapi.api.ipbdelivery.models.DeliveryResponse
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.MetroStation
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.OrderStatusInfo
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.RGDeliveryParams
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException
import org.openapitools.client.models.DeliveryMethod

internal class BaseIPBDeliveryRepository(
    handleException: HandleException,
    private val service: IPBDeliveryService
) : AbstractRepository(handleException), IPBDeliveryRepository {

    override suspend fun getDeliveryList(accessToken: String): Result<List<DeliveryMethod>?> =
        handle {
            val response = service.getDeliveryList(accessToken)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }

    override suspend fun createDeliveryOrder(
        setDeliveryTypeRequest: RGDeliveryParams, accessToken: String
    ): Result<DeliveryResponse?> = runCatching {
        val response = service.createDeliveryOrder(setDeliveryTypeRequest, accessToken)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.data
    }

    override suspend fun getMetroStations(accessToken: String): Result<List<MetroStation>?> =
        handle {
            val response = service.getMetroStations(accessToken)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.dataList
        }

    override suspend fun getOrderStatus(
        rdOrderId: String,
        rfServiceType: String
    ): Result<OrderStatusInfo?> =
        handle {
            val response = service.getOrderStatus(rdOrderId, rfServiceType)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }
}