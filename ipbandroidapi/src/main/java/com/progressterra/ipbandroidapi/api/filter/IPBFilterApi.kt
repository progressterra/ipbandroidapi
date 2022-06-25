package com.progressterra.ipbandroidapi.api.filter

import com.progressterra.ipbandroidapi.api.filter.models.FilterDataResponse
import com.progressterra.ipbandroidapi.api.filter.models.FilterRequest
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.ProductPageResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface IPBFilterApi {

    @POST("/product/byfilter")
    suspend fun getFilteredProducts(
        @Body request: FilterRequest
    ): ProductPageResponse

    @GET("/product/filterdata")
    suspend fun getFilterData(
        @Query("idCategory") idCategory: String
    ): FilterDataResponse
}