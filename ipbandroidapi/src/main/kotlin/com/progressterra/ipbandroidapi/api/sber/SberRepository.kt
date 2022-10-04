package com.progressterra.ipbandroidapi.api.sber

import com.progressterra.ipbandroidapi.api.sber.model.*

interface SberRepository {

    suspend fun registerOrder(idDHSaleHead: String): Result<OrderData>

    suspend fun sendCardData(idDHSaleHead: String, seToken: String): Result<PaymentData>

    suspend fun getOrderStatus(idDHSaleHead: String): Result<OrderStatus>
}