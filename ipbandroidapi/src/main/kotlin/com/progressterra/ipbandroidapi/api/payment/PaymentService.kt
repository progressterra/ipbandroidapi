package com.progressterra.ipbandroidapi.api.payment

import com.progressterra.ipbandroidapi.api.payment.models.DHPaymentClientViewModelResultData
import com.progressterra.ipbandroidapi.api.payment.models.DHPaymentClientViewModelResultDataList
import com.progressterra.ipbandroidapi.api.payment.models.DHPaymentEntityIncome
import com.progressterra.ipbandroidapi.api.payment.models.FilterAndSort
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface PaymentService {

    @POST("/clientarea/payment")
    suspend fun clientAreaPayment(
        @Header("AccessToken") accessToken: String,
        @Body body: DHPaymentEntityIncome
    ): DHPaymentClientViewModelResultData

    @POST("/clientarea/payment/list")
    suspend fun clientAreaPaymentList(
        @Header("AccessToken") accessToken: String,
        @Body body: FilterAndSort
    ): DHPaymentClientViewModelResultDataList

    @GET("/clientarea/payment/{idEntity}")
    suspend fun clientAreaPaymentById(
        @Header("AccessToken") accessToken: String,
        @Path("idEntity") idEntity: String
    ): DHPaymentClientViewModelResultData
}
