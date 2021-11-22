package com.progressterra.ipbandroidapi.api.ipbDeliveryService

import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.MetroStationsResponse
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.ResultDeliveryList
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.ResultOrderStatusCreation
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.SetDeliveryTypeRequest
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.payment.RegisterOrderResponse
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.payment.SendCardDataResponse
import retrofit2.http.*

/**
 * http://84.201.188.117:5025/docsapi/v1/index.html
 * http://84.201.188.97:1955/docsapi/v1/index.html
 */
internal interface IpbDeliveryServiceApi {
    interface IPBSberbank {
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


    interface Delivery {
        @GET("Delivery/GetDeliveryList/{AccessToken}")
        suspend fun getDeliveryList(@Path("AccessToken") accessToken: String): ResultDeliveryList

        @POST("Delivery/CreateDeliveryOrder/{AccessToken}")
        suspend fun createDeliveryOrder(
            @Body setDeliveryTypeRequest: SetDeliveryTypeRequest,
            @Path("AccessToken") accessToken: String
        ): ResultOrderStatusCreation

        @GET("/api/Metro/GetMetroStations/{AccessToken}")
        suspend fun getMetroStations(@Path("AccessToken") accessToken: String): MetroStationsResponse
    }
}



