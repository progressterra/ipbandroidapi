package com.progressterra.ipbandroidapi.api.paymentdata

import com.progressterra.ipbandroidapi.api.paymentdata.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.paymentdata.models.RFPaymentDataForClientViewModel
import com.progressterra.ipbandroidapi.api.paymentdata.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface PaymentDataRepository {

    suspend fun clientAreaList(
        accessToken: String,
        body: FilterAndSort
    ): Result<List<RFPaymentDataForClientViewModel>?>

    class Base(handleException: HandleException, private val service: PaymentDataService) :
        PaymentDataRepository, AbstractRepository(handleException) {

        override suspend fun clientAreaList(
            accessToken: String,
            body: FilterAndSort
        ): Result<List<RFPaymentDataForClientViewModel>?> = handle {
            val response = service.clientAreaList(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.dataList
        }
    }
}