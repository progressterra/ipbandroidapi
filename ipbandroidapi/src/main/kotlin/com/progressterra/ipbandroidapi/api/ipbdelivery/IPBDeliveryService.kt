package com.progressterra.ipbandroidapi.api.ipbdelivery

import com.progressterra.ipbandroidapi.api.ipbdelivery.models.DeliveryMethodResultDataList
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.RGDeliveryParams
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.ResultDeliveryStatusInfo
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.ResultMetroStation
import com.progressterra.ipbandroidapi.api.ipbdelivery.models.ResultOrderStatusCreation
import retrofit2.http.*

/**
 * [Docs](http://84.201.188.117:1955/docsapi/v1/index.html)
 */
internal interface IPBDeliveryService {

    @GET("Delivery/GetDeliveryList/{AccessToken}")
    suspend fun getDeliveryList(@Path("AccessToken") accessToken: String): DeliveryMethodResultDataList

    @POST("Delivery/CreateDeliveryOrder/{AccessToken}")
    suspend fun createDeliveryOrder(
        @Body setDeliveryTypeRequest: RGDeliveryParams,
        @Path("AccessToken") accessToken: String
    ): ResultOrderStatusCreation

    @GET("/api/Metro/GetMetroStations/{AccessToken}")
    suspend fun getMetroStations(@Path("AccessToken") accessToken: String): ResultMetroStation

    @GET("Delivery/GetOrderStatusInfo/{RDOrderId}/{RFServiceType}")
    suspend fun getOrderStatus(
        @Path("RDOrderId") rdOrderId: String,
        @Path("RFServiceType") rfServiceType: String
    ): ResultDeliveryStatusInfo
}