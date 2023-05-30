package com.progressterra.ipbandroidapi.api.complace

import com.progressterra.ipbandroidapi.api.complace.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.complace.models.RFComPlaceViewModelResultDataList
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

/**
 * [Docs](http://51.250.54.134:7019/swagger/index.html)
 */
interface ComPlaceService {

    @POST("/complace/list")
    suspend fun places(
        @Header("AccessToken") accessToken: String,
        @Body filterAndSort: FilterAndSort
    ): RFComPlaceViewModelResultDataList
}