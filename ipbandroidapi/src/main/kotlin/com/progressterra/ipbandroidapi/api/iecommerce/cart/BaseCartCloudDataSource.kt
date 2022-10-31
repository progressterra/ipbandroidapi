package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.model.DeliveryData
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAddAddress
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAndComment
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamGoodsToECommers
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamImplementBonusV3
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultCountInCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultOperation
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseCartCloudDataSource(
    private val service: CartService, handleException: HandleException
) : AbstractCloudDataSource(handleException), CartCloudDataSource {

    override suspend fun implementBonus(
        accessToken: String, request: ParamImplementBonusV3
    ): ResultCart = handle {
        service.implementBonus(accessToken, request)
    }

    override suspend fun getProductsInCart(accessToken: String): ResultCart = handle {
        service.getProductsInCart(accessToken)
    }

    override suspend fun getOrderById(orderId: String): ResultCart = handle {
        service.getOrderById(orderId)
    }

    override suspend fun removeProductFromCart(
        request: ParamGoodsToECommers, accessToken: String
    ): ResultOperation = handle {
        service.removeProductFromCart(request, accessToken)
    }

    override suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String, IDDRSaleRow: String
    ): ResultCart = handle {
        service.removeProductFromCartWithFullResponseModel(accessToken, IDDRSaleRow)
    }

    override suspend fun removeNomenclatureFromCart(
        accessToken: String, idrfNomenclature: String
    ): ResultCart = handle {
        service.removeNomenclatureFromCart(accessToken, idrfNomenclature)
    }

    override suspend fun addProductToCart(
        request: ParamGoodsToECommers, accessToken: String
    ): ResultCart = handle {
        service.addProductToCart(request, accessToken)
    }

    override suspend fun cancelBonusesImplementation(accessToken: String): ResultCart = handle {
        service.cancelBonusesImplementation(accessToken)
    }

    override suspend fun setDeliveryAddress(
        accessToken: String, request: ParamForAddAddress
    ): ResultOperation = handle {
        service.setDeliveryAddress(accessToken, request)
    }

    override suspend fun setDeliveryCommentary(
        accessToken: String, request: ParamForAndComment
    ): ResultOperation = handle {
        service.setDeliveryCommentary(accessToken, request)
    }

    override suspend fun confirmOrder(accessToken: String): ResultCart = handle {
        service.confirmOrder(accessToken)
    }

    override suspend fun fastAddToCart(
        accessToken: String, request: ParamGoodsToECommers
    ): ResultOperation = handle {
        service.fastAddToCart(accessToken, request)
    }

    override suspend fun getGoodsQuantity(
        accessToken: String, idrgGoodsInventory: String
    ): ResultCountInCart = handle {
        service.getGoodsQuantity(accessToken, idrgGoodsInventory)
    }

    override suspend fun addDeliveryToCart(acessToken: String, request: DeliveryData): ResultCart =
        handle {
            service.addDeliveryToCart(acessToken, request)
        }
}