package com.progressterra.ipbandroidapi.api.iProBonusApi

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.NotificationsResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IProBonusApi {

    /**
     * Получение списка покупок
     */
    @GET("/api/v1/clientpurchase/{AccessToken}")
    suspend fun getPurchasesList(@Path("AccessToken") accessToken: String): PurchasesResponse

    /**
     * Отображение детальной информации о покупке клиента
     */
    @GET("/api/v1/clientpurchase/info/{purchaseId}")
    suspend fun getPurchaseDetailInfo(@Path("purchaseId") purchaseId: String): PurchaseDetailInfoResponse


    @GET("/api/v1/messageinapp/{AccessToken}/inappmessages")
    suspend fun getInAppMessages(@Path("AccessToken") accessToken: String): NotificationsResponse

    @POST("/api/v1/messageinapp/{IDMessage}/setmessageasread")
    suspend fun setMessageIsRead(@Path("IDMessage") idMessage: String): BaseResponse

}