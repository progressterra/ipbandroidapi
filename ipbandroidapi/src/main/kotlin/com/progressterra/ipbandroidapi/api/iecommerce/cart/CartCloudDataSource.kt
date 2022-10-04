package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.*
import com.progressterra.ipbandroidapi.base.BaseResponse

internal interface CartCloudDataSource {

    suspend fun implementBonus(
        accessToken: String,
        implementBonusRequest: ImplementBonusRequest
    ): ProductsInBasketResponse

    suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse

    suspend fun getOrderById(orderId: String): ProductsInBasketResponse

    suspend fun removeProductFromCart(
        changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        accessToken: String
    ): BaseResponse

    suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String,
        idDrSaleRow: String
    ): ProductsInBasketResponse

    suspend fun removeNomenclatureFromCart(
        accessToken: String,
        idrfNomenclature: String
    ): ProductsInBasketResponse

    suspend fun addProductToCart(
        changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        accessToken: String
    ): ProductsInBasketResponse

    suspend fun cancelBonusesImplementation(accessToken: String): ProductsInBasketResponse

    suspend fun setDeliveryAddress(
        accessToken: String,
        setDeliveryAddressRequest: SetDeliveryAddressRequest
    ): BaseResponse

    suspend fun setDeliveryCommentary(
        accessToken: String,
        setDeliveryCommentaryRequest: SetDeliveryCommentaryRequest
    ): BaseResponse

    suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse

    suspend fun fastAddToCart(
        accessToken: String,
        request: ChangeProductCountInCartRequest
    ): BaseResponse

    suspend fun getGoodsQuantity(
        accessToken: String,
        idrgGoodsInventory: String
    ): GoodsQuantityResponse

    suspend fun addDeliveryToCart(
        accessToken: String,
        createDeliveryOrderRequest: CreateDeliveryOrderRequest
    ): ProductsInBasketResponse
}