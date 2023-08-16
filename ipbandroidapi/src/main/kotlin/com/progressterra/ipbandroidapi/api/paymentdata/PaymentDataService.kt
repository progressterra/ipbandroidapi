package com.progressterra.ipbandroidapi.api.paymentdata

import com.progressterra.ipbandroidapi.api.paymentdata.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.paymentdata.models.RFPaymentDataForClientViewModelResultDataList
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface PaymentDataService {

    @POST("/clientarea/list")
    suspend fun clientAreaList(
        @Header("AccessToken") accessToken: String,
        @Body body: FilterAndSort
    ): RFPaymentDataForClientViewModelResultDataList
}