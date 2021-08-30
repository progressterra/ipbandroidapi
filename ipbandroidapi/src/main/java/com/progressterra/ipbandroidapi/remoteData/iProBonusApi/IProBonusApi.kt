package com.progressterra.ipbandroidapi.remoteData.iProBonusApi

import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ChangeProductCountInCartRequest
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.UpdateUserInfoRequest
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.Response
import retrofit2.http.*

internal interface IProBonusApi {
    /**
     * получение базовой информации о клиенте
     * */
    @GET("/api/v3/clients/{AccessToken}/withadditionalinfo")
    suspend fun getClientInfo(@Path("AccessToken") accessToken: String): ClientInfoResponse

    /**
     * обновление базовой информации о клиенте
     * */
    @POST("/api/v3/clients/personalinfo/{AccessToken}")
    suspend fun updatePersonalInfo(
        @Path("AccessToken") accessToken: String,
        @Body updatePersonalData: UpdateUserInfoRequest
    ): ClientInfoResponse

    /**
     *  Получаем город клиента
     */
    @GET("/api/v1/clientcity/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun getCityClient(@Path("AccessToken") accessToken: String): CityResponse

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
    suspend fun cancelBonusesImplementation(@Path("AccessToken") accessToken: String): Response<ProductsInBasketResponse>
}