package com.progressterra.ipbandroidapi.api.ipbdelivery

import com.progressterra.ipbandroidapi.api.ipbdelivery.model.*
import com.progressterra.ipbandroidapi.api.ipbdelivery.model.SetDeliveryTypeRequest
import retrofit2.http.*

/**
 * [Docs](http://84.201.188.117:1955/docsapi/v1/index.html)
 */
internal interface IPBDeliveryService {

    @GET("Delivery/GetDeliveryList/{AccessToken}")
    suspend fun getDeliveryList(@Path("AccessToken") accessToken: String): ResultDeliveryResponse

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



