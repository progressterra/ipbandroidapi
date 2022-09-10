package com.progressterra.ipbandroidapi.api.sber

import com.progressterra.ipbandroidapi.api.sber.model.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.sber.model.RegisterOrderResponse
import com.progressterra.ipbandroidapi.api.sber.model.SendCardDataResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal interface SberCloudDataSource {

    suspend fun registerOrder(idDHSaleHead: String): RegisterOrderResponse

    suspend fun sendCardData(idDHSaleHead: String, seToken: String): SendCardDataResponse

    suspend fun getOrderStatus(idDHSaleHead: String): GetOrderStatusResponse

    class Base(
        private val service: SberService,
        handleException: HandleException
    ) : SberCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun registerOrder(idDHSaleHead: String): RegisterOrderResponse = handle {
            service.registerOrder(idDHSaleHead)
        }

        override suspend fun sendCardData(idDHSaleHead: String, seToken: String): SendCardDataResponse = handle {
            service.sendCardData(idDHSaleHead, seToken)
        }

        override suspend fun getOrderStatus(idDHSaleHead: String): GetOrderStatusResponse = handle {
            service.getOrderStatus(idDHSaleHead)
        }
    }
}