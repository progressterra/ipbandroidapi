package com.progressterra.ipbandroidapi.api.catalog

import com.progressterra.ipbandroidapi.api.catalog.models.CatalogItemResultData
import com.progressterra.ipbandroidapi.api.catalog.models.FilterAndSort
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface CatalogService {

    @POST("/browsing/catalog")
    suspend fun catalog(
        @Path("AccessToken") accessToken: String,
        @Body filterAndSort: FilterAndSort
    ): CatalogItemResultData
}