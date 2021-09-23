package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi

import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ImplementBonusRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.SetDeliveryAddressRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.SetDeliveryCommentaryRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.cart.ChangeProductCountInCartRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IECommersCoreApi {

    /**
     * Получаем список продуктов по списку идентификаторов RGGoodsInventory
     */
    @POST("/iecommercecore/api/v1/products/bylistid/{AccessToken}")
    suspend fun getProductsByIds(
        @Path("AccessToken") accessToken: String,
        @Body idsList: List<String>
    ): ProductPageResponse

    @POST("/iecommercecore/api/v3/cart/{AccessToken}/implementbonus")
    suspend fun implementBonus(
        @Path("AccessToken") accessToken: String,
        @Body implementBonusRequest: ImplementBonusRequest
    ): ProductsInBasketResponse

    /**
     * получение списка товаров в корзине для текущего пользователя
     */
    @GET("/iecommercecore/api/v3/cart/{AccessToken}")
    suspend fun getProductsInCart(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

    /**
     * удаление заданного количества товара из корзины, но возвращает только статус успешности
     */
    @POST("/iecommercecore/api/v3/cart/{AccessToken}/goods/count/remove")
    suspend fun removeProductFromCart(
        @Body changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        @Path("AccessToken") accessToken: String
    ): BaseResponse

    /**
     *  удаление заданного количества товара из корзины, но возвращает модель корзины полностью
     */
    @POST("/iecommercecore/api/v3/cart/{AccessToken}/removedrfromcart/{IDDRSaleRow}")
    suspend fun removeProductFromCartWithFullResponseModel(
        @Path("AccessToken") accessToken: String,
        @Path("IDDRSaleRow") IDDRSaleRow: String
    ): ProductsInBasketResponse

    /**
     * добавление заданного количества товара в корзину
     */
    @POST("/iecommercecore/api/v3/cart/{AccessToken}/addtocart")
    suspend fun addProductToCart(
        @Body changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        @Path("AccessToken") accessToken: String
    ): ProductsInBasketResponse

    /**
     *  Отменяет применение бонусов в корзине
     */
    @POST("/iecommercecore/api/v3/cart/{AccessToken}/cancelimplementbonus")
    suspend fun cancelBonusesImplementation(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

    /**
     *  Добавляет адрес доставки
     */
    @POST("/iecommercecore/api/v3/cart/{AccessToken}/address")
    suspend fun setDeliveryAddress(
        @Path("AccessToken") accessToken: String,
        @Body setDeliveryAddressRequest: SetDeliveryAddressRequest
    ): BaseResponse

    /**
     *  Добавляет комментарий клиента к заказу
     */
    @POST("/iecommercecore/api/v3/cart/{AccessToken}/comment")
    suspend fun setDeliveryCommentary(
        @Path("AccessToken") accessToken: String,
        @Body setDeliveryCommentaryRequest: SetDeliveryCommentaryRequest
    ): BaseResponse

    /**
     *  Устанавливает признак того, что заказ подтвержден
     */
    @POST("/iecommercecore/api/v3/cart/{AccessToken}/confirmorder")
    suspend fun confirmOrder(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

}