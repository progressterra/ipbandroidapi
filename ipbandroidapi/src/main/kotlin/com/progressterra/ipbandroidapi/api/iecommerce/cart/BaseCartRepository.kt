package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.*
import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.ChangeProductCountInCartRequest
import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.ImplementBonusRequest
import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.SetDeliveryAddressRequest
import com.progressterra.ipbandroidapi.api.ipbdelivery.model.DeliveryType
import com.progressterra.ipbandroidapi.api.ipbdelivery.model.ServiceType
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseCartRepository(
    private val cloudDataSource: CartCloudDataSource
) : AbstractRepository(), CartRepository {

    override suspend fun implementBonus(accessToken: String, bonusCount: Int): Result<BasketData> =
        handle {
            val response =
                cloudDataSource.implementBonus(accessToken, ImplementBonusRequest(bonusCount))
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { BasketData(it.basketInfo) }

    override suspend fun getProductsInCart(accessToken: String): Result<BasketData> = handle {
        val response = cloudDataSource.getProductsInCart(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { BasketData(it.basketInfo) }

    override suspend fun getOrderById(orderId: String): Result<BasketData> = handle {
        val response = cloudDataSource.getOrderById(orderId)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { BasketData(it.basketInfo) }

    override suspend fun removeProductFromCart(
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String,
        accessToken: String
    ): Result<Unit> = handle {
        val response = cloudDataSource.removeProductFromCart(
            ChangeProductCountInCartRequest(
                idGoodsInventory,
                count,
                idSellerAmbassador
            ), accessToken
        )
        if (response.status != 0)
            throw BadRequestException()
    }

    override suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String,
        idDrSaleRow: String
    ): Result<BasketData> = handle {
        val response =
            cloudDataSource.removeProductFromCartWithFullResponseModel(accessToken, idDrSaleRow)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { BasketData(it.basketInfo) }

    override suspend fun removeNomenclatureFromCart(
        accessToken: String,
        idrfNomenclature: String
    ): Result<BasketData> = handle {
        val response = cloudDataSource.removeNomenclatureFromCart(accessToken, idrfNomenclature)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { BasketData(it.basketInfo) }

    override suspend fun addProductToCart(
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String,
        accessToken: String
    ): Result<BasketData> = handle {
        val response = cloudDataSource.addProductToCart(
            ChangeProductCountInCartRequest(
                idGoodsInventory,
                count,
                idSellerAmbassador
            ), accessToken
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { BasketData(it.basketInfo) }

    override suspend fun cancelBonusesImplementation(accessToken: String): Result<BasketData> =
        handle {
            val response = cloudDataSource.cancelBonusesImplementation(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { BasketData(it.basketInfo) }

    override suspend fun setDeliveryAddress(
        accessToken: String,
        idAddress: String,
        addressString: String
    ): Result<Unit> = handle {
        val response = cloudDataSource.setDeliveryAddress(
            accessToken,
            SetDeliveryAddressRequest(accessToken, idAddress, addressString)
        )
        if (response.status != 0)
            throw BadRequestException()
    }

    override suspend fun setDeliveryCommentary(
        accessToken: String,
        commentary: String
    ): Result<Unit> = handle {
        val response = cloudDataSource.setDeliveryCommentary(
            accessToken,
            SetDeliveryCommentaryRequest(commentary)
        )
        if (response.status != 0)
            throw BadRequestException()
    }

    override suspend fun confirmOrder(accessToken: String): Result<BasketData> = handle {
        val response = cloudDataSource.confirmOrder(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { BasketData(it.basketInfo) }

    override suspend fun fastAddToCart(
        accessToken: String,
        idGoodsInventory: String,
        count: Int,
        idSellerAmbassador: String
    ): Result<Unit> = handle {
        val response = cloudDataSource.fastAddToCart(
            accessToken,
            ChangeProductCountInCartRequest(idGoodsInventory, count, idSellerAmbassador)
        )
        if (response.status != 0)
            throw BadRequestException()
    }

    override suspend fun getGoodsQuantity(
        accessToken: String,
        idrgGoodsInventory: String
    ): Result<GoodsQuantityData> = handle {
        val response = cloudDataSource.getGoodsQuantity(accessToken, idrgGoodsInventory)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        GoodsQuantityData(it.data)
    }

    override suspend fun addDeliveryToCart(
        accessToken: String,
        deliveryService: DeliveryService,
        displayName: String,
        calculatedPrice: Double,
        comment: String,
        deliveryType: DeliveryType,
        serviceType: ServiceType,
        pickUpPoint: String
    ): Result<BasketData> = handle {
        val response = cloudDataSource.addDeliveryToCart(
            accessToken,
            CreateDeliveryOrderRequest(
                deliveryService.id,
                displayName,
                calculatedPrice,
                comment,
                deliveryType.ordinal,
                serviceType.ordinal,
                pickUpPoint
            )
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { BasketData(it.basketInfo) }
}