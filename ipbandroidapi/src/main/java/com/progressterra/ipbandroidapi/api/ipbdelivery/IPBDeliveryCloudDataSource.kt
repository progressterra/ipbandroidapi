package com.progressterra.ipbandroidapi.api.ipbdelivery

import com.progressterra.ipbandroidapi.api.ipbdelivery.model.*
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

interface IPBDeliveryCloudDataSource {

    suspend fun getDeliveryList(accessToken: String): ResultDeliveryResponse

    suspend fun createDeliveryOrder(
        setDeliveryTypeRequest: SetDeliveryTypeRequest,
        accessToken: String
    ): ResultOrderStatusCreation

    suspend fun getMetroStations(accessToken: String): MetroStationsResponse

    suspend fun getOrderStatus(rdOrderId: String, rfServiceType: String): ResultDeliveryStatusInfo

    class Base(
        private val service: IPBDeliveryService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), IPBDeliveryCloudDataSource {

        override suspend fun getDeliveryList(accessToken: String): ResultDeliveryResponse = handle {
            service.getDeliveryList(accessToken)
        }

        override suspend fun createDeliveryOrder(
            setDeliveryTypeRequest: SetDeliveryTypeRequest,
            accessToken: String
        ): ResultOrderStatusCreation = handle {
            service.createDeliveryOrder(setDeliveryTypeRequest, accessToken)
        }

        override suspend fun getMetroStations(accessToken: String): MetroStationsResponse = handle {
            service.getMetroStations(accessToken)
        }

        override suspend fun getOrderStatus(
            rdOrderId: String,
            rfServiceType: String
        ): ResultDeliveryStatusInfo = handle {
            service.getOrderStatus(rdOrderId, rfServiceType)
        }
    }
}