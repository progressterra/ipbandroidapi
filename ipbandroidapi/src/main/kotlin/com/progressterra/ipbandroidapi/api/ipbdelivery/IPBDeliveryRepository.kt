package com.progressterra.ipbandroidapi.api.ipbdelivery

import com.progressterra.ipbandroidapi.api.ipbdelivery.models.DeliveryResponse
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.MetroStation
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.OrderStatusInfo
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.RGDeliveryParams
import org.openapitools.client.models.DeliveryMethod

interface IPBDeliveryRepository {

    suspend fun getDeliveryList(accessToken: String): Result<List<DeliveryMethod>?>

    suspend fun createDeliveryOrder(
        setDeliveryTypeRequest: RGDeliveryParams, accessToken: String
    ): Result<DeliveryResponse?>

    suspend fun getMetroStations(accessToken: String): Result<List<MetroStation>?>

    suspend fun getOrderStatus(
        rdOrderId: String, rfServiceType: String
    ): Result<OrderStatusInfo?>
}