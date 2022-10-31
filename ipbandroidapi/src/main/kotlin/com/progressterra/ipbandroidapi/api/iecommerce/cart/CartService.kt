package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.model.DeliveryData
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAddAddress
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAndComment
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamGoodsToECommers
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamImplementBonusV3
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultCountInCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultOperation
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:6023/docsapi/v1/index.html)
 */
interface CartService {

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/implementbonus")
    suspend fun implementBonus(
        @Path("AccessToken") accessToken: String, @Body request: ParamImplementBonusV3
    ): ResultCart

    @GET("/iecommercecore/api/v3/cart/{AccessToken}")
    suspend fun getProductsInCart(@Path("AccessToken") accessToken: String): ResultCart

    @GET("/iecommercecore/api/v3/cart/order/{IDHSalaHead}")
    suspend fun getOrderById(@Path("IDHSalaHead") orderId: String): ResultCart

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/goods/count/remove")
    suspend fun removeProductFromCart(
        @Body request: ParamGoodsToECommers, @Path("AccessToken") accessToken: String
    ): ResultOperation

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/removedrfromcart/{IDDRSaleRow}")
    suspend fun removeProductFromCartWithFullResponseModel(
        @Path("AccessToken") accessToken: String, @Path("IDDRSaleRow") IDDRSaleRow: String
    ): ResultCart

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/removenomenklaturefromcart/{IDRFNomenclature}")
    suspend fun removeNomenclatureFromCart(
        @Path("AccessToken") accessToken: String, @Path("IDRFNomenclature") idrfNomenclature: String
    ): ResultCart

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/addtocart")
    suspend fun addProductToCart(
        @Body request: ParamGoodsToECommers, @Path("AccessToken") accessToken: String
    ): ResultCart

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/cancelimplementbonus")
    suspend fun cancelBonusesImplementation(@Path("AccessToken") accessToken: String): ResultCart

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/address")
    suspend fun setDeliveryAddress(
        @Path("AccessToken") accessToken: String, @Body request: ParamForAddAddress
    ): ResultOperation

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/comment")
    suspend fun setDeliveryCommentary(
        @Path("AccessToken") accessToken: String, @Body request: ParamForAndComment
    ): ResultOperation

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/confirmorder")
    suspend fun confirmOrder(@Path("AccessToken") accessToken: String): ResultCart

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/goods/count")
    suspend fun fastAddToCart(
        @Path("AccessToken") accessToken: String, @Body request: ParamGoodsToECommers
    ): ResultOperation

    @GET("/iecommercecore/api/v3/cart/{AccessToken}/goods/{IDRGGoodsInventory}")
    suspend fun getGoodsQuantity(
        @Path("AccessToken") accessToken: String,
        @Path("IDRGGoodsInventory") idrgGoodsInventory: String
    ): ResultCountInCart

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/delivery")
    suspend fun addDeliveryToCart(
        @Path("AccessToken") acessToken: String, @Body request: DeliveryData
    ): ResultCart
}