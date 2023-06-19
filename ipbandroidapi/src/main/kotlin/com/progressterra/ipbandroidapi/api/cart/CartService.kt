package com.progressterra.ipbandroidapi.api.cart

import com.progressterra.ipbandroidapi.api.cart.models.DHSaleHeadAsOrderViewModelResultData
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataAddProductAsInstallmentPlan
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataAddProductFullPrice
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataComment
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataImplementBonuses
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface CartService {

    @GET("/cart")
    suspend fun cart(
        @Header("AccessToken") accessToken: String
    ): DHSaleHeadAsOrderViewModelResultData

    @POST("/cart/salerow")
    suspend fun addToCart(
        @Header("AccessToken") accessToken: String, @Body income: IncomeDataAddProductFullPrice
    ): DHSaleHeadAsOrderViewModelResultData

    @DELETE("/cart/salerow")
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
}