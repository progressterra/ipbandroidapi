package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.*

interface CartRepository {

    suspend fun implementBonus(
        accessToken: String,
        bonusCount: Int
    ): Result<BasketData>

    suspend fun getProductsInCart(accessToken: String): Result<BasketData>

    suspend fun getOrderById(orderId: String): Result<BasketData>

    suspend fun removeProductFromCart(
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String,
        accessToken: String
    ): Result<Unit>

    suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String,
        idDrSaleRow: String
    ): Result<BasketData>

    suspend fun removeNomenclatureFromCart(
        accessToken: String,
        idrfNomenclature: String
    ): Result<BasketData>

    suspend fun addProductToCart(
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String,
        accessToken: String
    ): Result<BasketData>

    suspend fun cancelBonusesImplementation(accessToken: String): Result<BasketData>

    suspend fun setDeliveryAddress(
        accessToken: String,
        idAddress: String,
        addressString: String
    ): Result<Unit>

    suspend fun setDeliveryCommentary(
        accessToken: String,
        commentary: String
    ): Result<Unit>

    suspend fun confirmOrder(accessToken: String): Result<BasketData>

    suspend fun fastAddToCart(
        accessToken: String,
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String
    ): Result<Unit>

    suspend fun getGoodsQuantity(
        accessToken: String,
        idrgGoodsInventory: String
    ): Result<GoodsQuantityData>

    suspend fun addDeliveryToCart(
        accessToken: String,
        idrgGoodsInventory: String,
        displayName: String,
        calculatedPrice: Double,
        comment: String,
        methodType: Int,
        serviceType: Int,
        pickUpPoint: String
    ): Result<BasketData>
}