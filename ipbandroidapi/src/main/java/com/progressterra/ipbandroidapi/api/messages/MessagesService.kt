package com.progressterra.ipbandroidapi.api.messages

import com.progressterra.ipbandroidapi.api.messages.model.NotificationsResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MessagesService {

    @GET("/api/v1/messageinapp/{AccessToken}/inappmessages")
    suspend fun getInAppMessages(@Path("AccessToken") accessToken: String): NotificationsResponse

    @POST("/api/v1/messageinapp/{IDMessage}/setmessageasread")
    suspend fun setMessageIsRead(@Path("IDMessage") idMessage: String): BaseResponse

}