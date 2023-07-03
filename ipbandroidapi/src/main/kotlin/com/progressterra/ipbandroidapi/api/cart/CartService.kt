package com.progressterra.ipbandroidapi.api.cart

import com.progressterra.ipbandroidapi.api.cart.models.DHSaleHeadAsOrderViewModelResultData
import com.progressterra.ipbandroidapi.api.cart.models.DHSaleHeadAsOrderViewModelResultDataList
import com.progressterra.ipbandroidapi.api.cart.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataAddProductAsInstallmentPlan
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataAddProductFullPrice
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataComment
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataImplementBonuses
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface CartService {

    @GET("/cart")
    suspend fun cart(
        @Header("AccessToken") accessToken: String
    ): DHSaleHeadAsOrderViewModelResultData

    @POST("/cart/salerow")
    suspend fun addToCart(
        @Header("AccessToken") accessToken: String, @Body income: IncomeDataAddProductFullPrice
    ): DHSaleHeadAsOrderViewModelResultData

    @HTTP(method = "DELETE", path = "/cart/salerow", hasBody = true)
    suspend fun deleteFromCart(
        @Header("AccessToken") accessToken: String, @Body income: IncomeDataAddProductFullPrice
    ): DHSaleHeadAsOrderViewModelResultData

    @POST("/cart/salerow/installmentplan")
    suspend fun addToCartInstallment(
        @Header("AccessToken") accessToken: String,
        @Body income: IncomeDataAddProductAsInstallmentPlan
    ): DHSaleHeadAsOrderViewModelResultData

    @POST("/cart/internalpayment")
    suspend fun paymentInternal(@Header("AccessToken") accessToken: String): DHSaleHeadAsOrderViewModelResultData

    @POST("/cart/comment")
    suspend fun addComment(
        @Header("AccessToken") accessToken: String,
        @Body income: IncomeDataComment
    ): DHSaleHeadAsOrderViewModelResultData

    @POST("/cart/bonuses")
    suspend fun useBonuses(
        @Header("AccessToken") accessToken: String,
        @Body income: IncomeDataImplementBonuses
    ): DHSaleHeadAsOrderViewModelResultData

    @DELETE("/cart/bonuses")
    suspend fun cancelBonuses(
        @Header("AccessToken") accessToken: String
    ): DHSaleHeadAsOrderViewModelResultData

    @POST("/cart/confirm")
    suspend fun confirmOrder(
        @Header("AccessToken") accessToken: String
    ): DHSaleHeadAsOrderViewModelResultData

    @POST("/order/list")
    suspend fun orders(
        @Header("AccessToken") accessToken: String,
        @Body income: FilterAndSort
    ): DHSaleHeadAsOrderViewModelResultDataList

    @POST("/order/{idOrder}")
    suspend fun orderById(
        @Header("AccessToken") accessToken: String,
        @Path("idOrder") idOrder: String
    ): DHSaleHeadAsOrderViewModelResultData

    @DELETE("/order")
    suspend fun cancelOrder(
        @Header("AccessToken") accessToken: String,
        @Query("idOrder") idOrder: String
    ): DHSaleHeadAsOrderViewModelResultData
}