package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.cart.model.*
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseCartCloudDataSource(
    private val service: CartService,
    handleException: HandleException
) : AbstractCloudDataSource(handleException), CartCloudDataSource {

    override suspend fun implementBonus(
        accessToken: String,
        implementBonusRequest: ImplementBonusRequest
    ): ProductsInBasketResponse = handle {
        service.implementBonus(accessToken, implementBonusRequest)
    }

    override suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse =
        handle {
            service.getProductsInCart(accessToken)
        }

    override suspend fun getOrderById(orderId: String): ProductsInBasketResponse = handle {
        service.getOrderById(orderId)
    }

    override suspend fun removeProductFromCart(
        changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        accessToken: String
    ): BaseResponse = handle {
        service.removeProductFromCart(changeProductCountInCartRequest, accessToken)
    }

    override suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String,
        idDrSaleRow: String
    ): ProductsInBasketResponse = handle {
        service.removeProductFromCartWithFullResponseModel(accessToken, idDrSaleRow)
    }

    override suspend fun removeNomenclatureFromCart(
        accessToken: String,
        idrfNomenclature: String
    ): ProductsInBasketResponse = handle {
        service.removeNomenclatureFromCart(accessToken, idrfNomenclature)
    }

    override suspend fun addProductToCart(
        changeProductCountInCartRequest: ChangeProductCountInCartRequest,
        accessToken: String
    ): ProductsInBasketResponse = handle {
        service.addProductToCart(changeProductCountInCartRequest, accessToken)
    }

    override suspend fun cancelBonusesImplementation(accessToken: String): ProductsInBasketResponse =
        handle {
            service.cancelBonusesImplementation(accessToken)
        }

    override suspend fun setDeliveryAddress(
        accessToken: String,
        setDeliveryAddressRequest: SetDeliveryAddressRequest
    ): BaseResponse = handle {
        service.setDeliveryAddress(accessToken, setDeliveryAddressRequest)
    }

    override suspend fun setDeliveryCommentary(
        accessToken: String,
        setDeliveryCommentaryRequest: SetDeliveryCommentaryRequest
    ): BaseResponse = handle {
        service.setDeliveryCommentary(accessToken, setDeliveryCommentaryRequest)
    }

    override suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse = handle {
        service.confirmOrder(accessToken)
    }

    override suspend fun fastAddToCart(
        accessToken: String,
        request: ChangeProductCountInCartRequest
    ): BaseResponse = handle {
        service.fastAddToCart(accessToken, request)
    }

    override suspend fun getGoodsQuantity(
        accessToken: String,
        idrgGoodsInventory: String
    ): GoodsQuantityResponse = handle {
        service.getGoodsQuantity(accessToken, idrgGoodsInventory)
    }

    override suspend fun addDeliveryToCart(
        accessToken: String,
        createDeliveryOrderRequest: CreateDeliveryOrderRequest
    ): ProductsInBasketResponse = handle {
        service.addDeliveryToCart(accessToken, createDeliveryOrderRequest)
    }
}