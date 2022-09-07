package com.progressterra.ipbandroidapi.api.ipbdeliveryservice

import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.payment.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery.*
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.payment.RegisterOrderResponse
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.payment.SendCardDataResponse
import retrofit2.http.*

/**
 * http://84.201.188.117:5025/docsapi/v1/index.html
 * http://84.201.188.97:1955/docsapi/v1/index.html
 */
internal interface IpbDeliveryServiceApi {

    interface IPBSberbank {

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

        @GET("/Delivery/GetOrderStatusInfo/{RDOrderId}/{RFServiceType}")
        suspend fun getOrderStatus(
            @Path("RDOrderId") rdOrderId: String,
            @Path("RFServiceType") rfServiceType: String
        ): ResultDeliveryStatusInfo
    }
}



