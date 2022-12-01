package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.model.DataRowInCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.DeliveryData
import com.progressterra.ipbandroidapi.api.iecommerce.model.ExtDHSaleHead
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAddAddress
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAndComment
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamGoodsToECommers
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamImplementBonusV3
import com.progressterra.core.AbstractRepository
import com.progressterra.core.BadRequestException
import com.progressterra.core.HandleException

internal class BaseCartRepository(
    handleException: HandleException,
    private val service: CartService
) : AbstractRepository(handleException), CartRepository {

    override suspend fun implementBonus(
        accessToken: String, request: ParamImplementBonusV3
    ): Result<ExtDHSaleHead?> = handle {
        val response = service.implementBonus(accessToken, request)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun getProductsInCart(accessToken: String): Result<ExtDHSaleHead?> =
        handle {
            val response = service.getProductsInCart(accessToken)
            if (response.result?.status != 0) {
                throw BadRequestException()
            }
            response.data
        }

    override suspend fun getOrderById(orderId: String): Result<ExtDHSaleHead?> = handle {
        val response = service.getOrderById(orderId)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun removeProductFromCart(
        request: ParamGoodsToECommers, accessToken: String
    ): Result<Unit> = handle {
        val response = service.removeProductFromCart(request, accessToken)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String, IDDRSaleRow: String
    ): Result<ExtDHSaleHead?> = handle {
        val response =
            service.removeProductFromCartWithFullResponseModel(accessToken, IDDRSaleRow)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun removeNomenclatureFromCart(
        accessToken: String, idrfNomenclature: String
    ): Result<ExtDHSaleHead?> = handle {
        val response = service.removeNomenclatureFromCart(accessToken, idrfNomenclature)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun addProductToCart(
        request: ParamGoodsToECommers, accessToken: String
    ): Result<ExtDHSaleHead?> = handle {
        val response = service.addProductToCart(request, accessToken)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun cancelBonusesImplementation(accessToken: String): Result<ExtDHSaleHead?> =
        handle {
            val response = service.cancelBonusesImplementation(accessToken)
            if (response.result?.status != 0) {
                throw BadRequestException()
            }
            response.data
        }

    override suspend fun setDeliveryAddress(
        accessToken: String, request: ParamForAddAddress
    ): Result<Unit> = handle {
        val response = service.setDeliveryAddress(accessToken, request)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun setDeliveryCommentary(
        accessToken: String, request: ParamForAndComment
    ): Result<Unit> = handle {
        val response = service.setDeliveryCommentary(accessToken, request)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun confirmOrder(accessToken: String): Result<ExtDHSaleHead?> = handle {
        val response = service.confirmOrder(accessToken)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun fastAddToCart(
        accessToken: String, request: ParamGoodsToECommers
    ): Result<Unit> = handle {
        val response = service.fastAddToCart(accessToken, request)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun getGoodsQuantity(
        accessToken: String, idrgGoodsInventory: String
    ): Result<DataRowInCart?> = handle {
        val response = service.getGoodsQuantity(accessToken, idrgGoodsInventory)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun addDeliveryToCart(
        acessToken: String, request: DeliveryData
    ): Result<ExtDHSaleHead?> = handle {
        val response = service.addDeliveryToCart(acessToken, request)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }
}