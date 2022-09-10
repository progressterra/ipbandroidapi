package com.progressterra.ipbandroidapi.api.sber

import com.progressterra.ipbandroidapi.api.sber.model.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.sber.model.RegisterOrderResponse
import com.progressterra.ipbandroidapi.api.sber.model.SendCardDataResponse
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

internal interface SberService {

    @POST("/IPBSberbank/register/{idDHSaleHead}")
    suspend fun registerOrder(@Path("idDHSaleHead") idDHSaleHead: String): RegisterOrderResponse

    @POST("/IPBSberbank/paymentOrder/{idDHSaleHead}")
    @Headers("Content-Type: application/json")
    suspend fun sendCardData(
        @Path("idDHSaleHead") idDHSaleHead: String,
        @Query("seToken") seToken: String
    ): SendCardDataResponse

    @POST("/IPBSberbank/getOrderStatus/{idDHSaleHead}")
    @Headers("Content-Type: application/json")
    suspend fun getOrderStatus(@Path("idDHSaleHead") idDHSaleHead: String): GetOrderStatusResponse
}