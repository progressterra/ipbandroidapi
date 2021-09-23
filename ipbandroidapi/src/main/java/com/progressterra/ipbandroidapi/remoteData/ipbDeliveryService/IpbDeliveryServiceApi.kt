package com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService

import com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService.models.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService.models.RegisterOrderResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

internal interface IpbDeliveryServiceApi {

    @POST("/IPBSberbank/register/{idDHSaleHead}")
    suspend fun registerOrder(@Path("idDHSaleHead") idDHSaleHead: String): RegisterOrderResponse

    @POST("/IPBSberbank/paymentOrder/{idDHSaleHead}")
    @Headers("Content-Type: application/json")
    suspend fun sendCardData(
        @Path("idDHSaleHead") idDHSaleHead: String,
        @Query("seToken") seToken: String
    ): BaseResponse

    @POST("/IPBSberbank/getOrderStatus/{idDHSaleHead}")
    @Headers("Content-Type: application/json")
    suspend fun getOrderStatus(@Path("idDHSaleHead") idDHSaleHead: String): GetOrderStatusResponse
}



