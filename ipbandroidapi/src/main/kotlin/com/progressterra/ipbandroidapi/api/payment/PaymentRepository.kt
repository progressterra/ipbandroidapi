package com.progressterra.ipbandroidapi.api.payment

import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException
import com.progressterra.ipbandroidapi.api.payment.models.DHPaymentClientViewModel
import com.progressterra.ipbandroidapi.api.payment.models.DHPaymentEntityIncome
import com.progressterra.ipbandroidapi.api.payment.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.payment.models.StatusResult

interface PaymentRepository {

    suspend fun clientAreaPayment(
        accessToken: String,
        body: DHPaymentEntityIncome
    ): Result<DHPaymentClientViewModel?>

    suspend fun clientAreaPaymentList(
        accessToken: String,
        body: FilterAndSort
    ): Result<List<DHPaymentClientViewModel>?>

    suspend fun clientAreaPaymentById(
        accessToken: String,
        idEntity: String
    ): Result<DHPaymentClientViewModel?>

    class Base(
        handleException: HandleException,
        val service: PaymentService
    ) : AbstractRepository(handleException), PaymentRepository {

        override suspend fun clientAreaPayment(
            accessToken: String,
            body: DHPaymentEntityIncome
        ): Result<DHPaymentClientViewModel?> = handle {
            val response = service.clientAreaPayment(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun clientAreaPaymentList(
            accessToken: String,
            body: FilterAndSort
        ): Result<List<DHPaymentClientViewModel>?> = handle {
            val response = service.clientAreaPaymentList(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.dataList
        }

        override suspend fun clientAreaPaymentById(
            accessToken: String,
            idEntity: String
        ): Result<DHPaymentClientViewModel?> = handle {
            val response = service.clientAreaPaymentById(accessToken, idEntity)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }
    }
}