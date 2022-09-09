package com.progressterra.ipbandroidapi.api.iecommerce.youmoney

import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.PaymentTokenRequest
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.YooMoneyConfirmationResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * http://84.201.188.117:6023/docsapi/v1/index.html
 */
internal interface YouMoneyService {

    @POST("iecommercecore/api/v1/yandexcash/payment/{AccessToken}")
    suspend fun sendYooMoneyToken(
        @Path("AccessToken") accessToken: String,
        @Body data: PaymentTokenRequest
    ): YooMoneyConfirmationResponse

    @GET("/iecommercecore/api/v1/yandexcash/payment/{CartID}")
    suspend fun getPaymentConfirmation(@Path("CartID") cartId: String): BaseResponse
}