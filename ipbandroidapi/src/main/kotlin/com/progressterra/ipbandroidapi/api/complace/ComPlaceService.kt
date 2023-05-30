package com.progressterra.ipbandroidapi.api.complace

import com.progressterra.ipbandroidapi.api.complace.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.complace.models.RFComPlaceViewModelResultDataList
import retrofit2.http.POST

/**
 * [Docs](http://51.250.54.134:7019/swagger/index.html)
 */
interface ComPlaceService {

    @POST("/complace/list")
    fun places(filterAndSort: FilterAndSort) : RFComPlaceViewModelResultDataList
}