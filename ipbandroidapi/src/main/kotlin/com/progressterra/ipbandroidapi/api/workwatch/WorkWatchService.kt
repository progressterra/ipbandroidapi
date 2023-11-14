package com.progressterra.ipbandroidapi.api.workwatch

import com.progressterra.ipbandroidapi.api.workwatch.models.RGTrackingEntity
import com.progressterra.ipbandroidapi.api.workwatch.models.RGTrackingViewModelResultData
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface WorkWatchService {

    @POST("clientarea/tracking")
    suspend fun clientAreaTracking(
        @Header("AccessToken") token: String,
        @Body body: RGTrackingEntity
    ): RGTrackingViewModelResultData
}