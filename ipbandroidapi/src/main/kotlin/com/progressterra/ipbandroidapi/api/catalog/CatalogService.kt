package com.progressterra.ipbandroidapi.api.catalog

import com.progressterra.ipbandroidapi.api.catalog.models.CatalogItemResultData
import com.progressterra.ipbandroidapi.api.catalog.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.catalog.models.RFCatalogCategoryViewModelResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface CatalogService {

    @POST("/browsing/catalog")
    suspend fun catalog(
        @Header("AccessToken") accessToken: String,
        @Body filterAndSort: FilterAndSort
    ): CatalogItemResultData

    @GET("/browsing/category/{idCategory}")
    suspend fun category(
        @Header("AccessToken") accessToken: String,
        @Path("idCategory") path: String
    ): RFCatalogCategoryViewModelResultData
}