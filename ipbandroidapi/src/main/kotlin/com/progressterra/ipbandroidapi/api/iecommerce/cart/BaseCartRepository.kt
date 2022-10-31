package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.model.DataRowInCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.DeliveryData
import com.progressterra.ipbandroidapi.api.iecommerce.model.ExtDHSaleHead
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAddAddress
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAndComment
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamGoodsToECommers
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamImplementBonusV3
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseCartRepository(
    private val cloudDataSource: CartCloudDataSource
) : AbstractRepository(), CartRepository {

    override suspend fun implementBonus(
        accessToken: String, request: ParamImplementBonusV3
    ): Result<ExtDHSaleHead?> = runCatching {
        val response = cloudDataSource.implementBonus(accessToken, request)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun getProductsInCart(accessToken: String): Result<ExtDHSaleHead?> =
        runCatching {
            val response = cloudDataSource.getProductsInCart(accessToken)
            if (response.result?.status != 0) {
                throw BadRequestException()
            }
            response.data
        }

    override suspend fun getOrderById(orderId: String): Result<ExtDHSaleHead?> = runCatching {
        val response = cloudDataSource.getOrderById(orderId)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun removeProductFromCart(
        request: ParamGoodsToECommers, accessToken: String
    ): Result<Unit> = runCatching {
        val response = cloudDataSource.removeProductFromCart(request, accessToken)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String, IDDRSaleRow: String
    ): Result<ExtDHSaleHead?> = runCatching {
        val response =
            cloudDataSource.removeProductFromCartWithFullResponseModel(accessToken, IDDRSaleRow)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun removeNomenclatureFromCart(
        accessToken: String, idrfNomenclature: String
    ): Result<ExtDHSaleHead?> = runCatching {
        val response = cloudDataSource.removeNomenclatureFromCart(accessToken, idrfNomenclature)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun addProductToCart(
        request: ParamGoodsToECommers, accessToken: String
    ): Result<ExtDHSaleHead?> = runCatching {
        val response = cloudDataSource.addProductToCart(request, accessToken)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun cancelBonusesImplementation(accessToken: String): Result<ExtDHSaleHead?> =
        runCatching {
            val response = cloudDataSource.cancelBonusesImplementation(accessToken)
            if (response.result?.status != 0) {
                throw BadRequestException()
            }
            response.data
        }

    override suspend fun setDeliveryAddress(
        accessToken: String, request: ParamForAddAddress
    ): Result<Unit> = runCatching {
        val response = cloudDataSource.setDeliveryAddress(accessToken, request)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun setDeliveryCommentary(
        accessToken: String, request: ParamForAndComment
    ): Result<Unit> = runCatching {
        val response = cloudDataSource.setDeliveryCommentary(accessToken, request)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun confirmOrder(accessToken: String): Result<ExtDHSaleHead?> = runCatching {
        val response = cloudDataSource.confirmOrder(accessToken)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun fastAddToCart(
        accessToken: String, request: ParamGoodsToECommers
    ): Result<Unit> = runCatching {
        val response = cloudDataSource.fastAddToCart(accessToken, request)
        if (response.status != 0) {
            throw BadRequestException()
        }
    }

    override suspend fun getGoodsQuantity(
        accessToken: String, idrgGoodsInventory: String
    ): Result<DataRowInCart?> = runCatching {
        val response = cloudDataSource.getGoodsQuantity(accessToken, idrgGoodsInventory)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }

    override suspend fun addDeliveryToCart(
        acessToken: String, request: DeliveryData
    ): Result<ExtDHSaleHead?> = runCatching {
        val response = cloudDataSource.addDeliveryToCart(acessToken, request)
        if (response.result?.status != 0) {
            throw BadRequestException()
        }
        response.data
    }
}