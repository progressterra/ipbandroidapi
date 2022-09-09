package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.*

interface CartRepository {

    suspend fun implementBonus(
        accessToken: String,
        bonusCount: Int
    ): ProductsInBasketResponse

    suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse

    suspend fun getOrderById(orderId: String): ProductsInBasketResponse

    suspend fun removeProductFromCart(
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String,
        accessToken: String
    ): Result<Unit>

    suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String,
        idDrSaleRow: String
    ): ProductsInBasketResponse

    suspend fun removeNomenclatureFromCart(
        accessToken: String,
        idrfNomenclature: String
    ): ProductsInBasketResponse

    suspend fun addProductToCart(
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String,
        accessToken: String
    ): ProductsInBasketResponse

    suspend fun cancelBonusesImplementation(accessToken: String): ProductsInBasketResponse

    suspend fun setDeliveryAddress(
        accessToken: String,
        idAddress: String,
        addressString: String
    ): Result<Unit>

    suspend fun setDeliveryCommentary(
        accessToken: String,
        commentary: String
    ): Result<Unit>

    suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse

    suspend fun fastAddToCart(
        accessToken: String,
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String
    ): Result<Unit>

    suspend fun getGoodsQuantity(
        accessToken: String,
        idrgGoodsInventory: String
    ): GoodsQuantityResponse

    suspend fun addDeliveryToCart(
        acessToken: String,
        idrgGoodsInventory: String,
        displayName: String,
        calculatedPrice: Double,
        comment: String,
        methodType: Int,
        serviceType: Int,
        pickUpPoint: String
    ): ProductsInBasketResponse
}