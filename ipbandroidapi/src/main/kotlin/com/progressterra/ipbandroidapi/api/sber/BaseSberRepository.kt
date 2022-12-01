package com.progressterra.ipbandroidapi.api.sber

import com.progressterra.ipbandroidapi.api.sber.model.OrderData
import com.progressterra.ipbandroidapi.api.sber.model.OrderStatus
import com.progressterra.ipbandroidapi.api.sber.model.PaymentData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.HandleException

internal class BaseSberRepository(
    handleException: HandleException,
    private val service: SberService
) : AbstractRepository(handleException), SberRepository {

    override suspend fun registerOrder(idDHSaleHead: String): Result<OrderData> = handle {
        service.registerOrder(idDHSaleHead)
    }.map { OrderData(it) }

    override suspend fun sendCardData(idDHSaleHead: String, seToken: String): Result<PaymentData> = handle {
        service.sendCardData(idDHSaleHead, seToken)
    }.map { PaymentData(it.data) }

    override suspend fun getOrderStatus(idDHSaleHead: String): Result<OrderStatus> = handle {
        service.getOrderStatus(idDHSaleHead)
    }.map { it.orderStatus }
}