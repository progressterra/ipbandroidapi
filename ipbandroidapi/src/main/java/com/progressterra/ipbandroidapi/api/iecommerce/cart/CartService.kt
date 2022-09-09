package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.*
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * http://84.201.188.117:6023/docsapi/v1/index.html
 */
interface CartService {

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/implementbonus")
    suspend fun implementBonus(
        @Path("AccessToken") accessToken: String,
        @Body implementBonusRequest: ImplementBonusRequest
    ): ProductsInBasketResponse

    @GET("/iecommercecore/api/v3/cart/{AccessToken}")
    suspend fun getProductsInCart(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

    @GET("/iecommercecore/api/v3/cart/order/{IDHSalaHead}")
    suspend fun getOrderById(@Path("IDHSalaHead") orderId: String): ProductsInBasketResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/goods/count/remove")
    suspend fun removeProductFromCart(
        @Body changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        @Path("AccessToken") accessToken: String
    ): BaseResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/removedrfromcart/{IDDRSaleRow}")
    suspend fun removeProductFromCartWithFullResponseModel(
        @Path("AccessToken") accessToken: String,
        @Path("IDDRSaleRow") IDDRSaleRow: String
    ): ProductsInBasketResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/removenomenklaturefromcart/{IDRFNomenclature}")
    suspend fun removeNomenclatureFromCart(
        @Path("AccessToken") accessToken: String,
        @Path("IDRFNomenclature") idrfNomenclature: String
    ): ProductsInBasketResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/addtocart")
    suspend fun addProductToCart(
        @Body changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        @Path("AccessToken") accessToken: String
    ): ProductsInBasketResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/cancelimplementbonus")
    suspend fun cancelBonusesImplementation(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/address")
    suspend fun setDeliveryAddress(
        @Path("AccessToken") accessToken: String,
        @Body setDeliveryAddressRequest: SetDeliveryAddressRequest
    ): BaseResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/comment")
    suspend fun setDeliveryCommentary(
        @Path("AccessToken") accessToken: String,
        @Body setDeliveryCommentaryRequest: SetDeliveryCommentaryRequest
    ): BaseResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/confirmorder")
    suspend fun confirmOrder(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/goods/count")
    suspend fun fastAddToCart(
        @Path("AccessToken") accessToken: String,
        @Body request: ChangeProductCountInCartRequest
    ): BaseResponse

    @GET("/iecommercecore/api/v3/cart/{AccessToken}/goods/{IDRGGoodsInventory}")
    suspend fun getGoodsQuantity(
        @Path("AccessToken") accessToken: String,
        @Path("IDRGGoodsInventory") idrgGoodsInventory: String
    ): GoodsQuantityResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/delivery")
    suspend fun addDeliveryToCart(
        @Path("AccessToken") acessToken: String,
        @Body createDeliveryOrderRequest: CreateDeliveryOrderRequest
    ): ProductsInBasketResponse
}