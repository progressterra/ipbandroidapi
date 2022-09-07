package com.progressterra.ipbandroidapi.api.sber

import com.progressterra.ipbandroidapi.api.sber.model.*
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface SberRepository {

    suspend fun registerOrder(idDHSaleHead: String): Result<OrderData>

    suspend fun sendCardData(idDHSaleHead: String, seToken: String): Result<PaymentData>

    suspend fun getOrderStatus(idDHSaleHead: String): Result<OrderStatus>

    class Base(
        private val cloudDataSource: SberCloudDataSource
    ) : AbstractRepository(), SberRepository {

        override suspend fun registerOrder(idDHSaleHead: String): Result<OrderData> = handle {
            cloudDataSource.registerOrder(idDHSaleHead)
        }.map { OrderData(it) }

        override suspend fun sendCardData(idDHSaleHead: String, seToken: String): Result<PaymentData> = handle {
            cloudDataSource.sendCardData(idDHSaleHead, seToken)
        }.map { PaymentData(it.data) }

        override suspend fun getOrderStatus(idDHSaleHead: String): Result<OrderStatus> = handle {
            cloudDataSource.getOrderStatus(idDHSaleHead)
        }.map { it.orderStatus }
    }
}