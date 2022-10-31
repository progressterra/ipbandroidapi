package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.model.DeliveryData
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAddAddress
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAndComment
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamGoodsToECommers
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamImplementBonusV3
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultCountInCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultOperation

internal interface CartCloudDataSource {

    suspend fun implementBonus(
        accessToken: String, request: ParamImplementBonusV3
    ): ResultCart

    suspend fun getProductsInCart(accessToken: String): ResultCart

    suspend fun getOrderById(orderId: String): ResultCart

    suspend fun removeProductFromCart(
        request: ParamGoodsToECommers, accessToken: String
    ): ResultOperation

    suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String, IDDRSaleRow: String
    ): ResultCart

    suspend fun removeNomenclatureFromCart(
        accessToken: String, idrfNomenclature: String
    ): ResultCart

    suspend fun addProductToCart(
        request: ParamGoodsToECommers, accessToken: String
    ): ResultCart

    suspend fun cancelBonusesImplementation(accessToken: String): ResultCart

    suspend fun setDeliveryAddress(
        accessToken: String, request: ParamForAddAddress
    ): ResultOperation

    suspend fun setDeliveryCommentary(
        accessToken: String, request: ParamForAndComment
    ): ResultOperation

    suspend fun confirmOrder(accessToken: String): ResultCart

    suspend fun fastAddToCart(
        accessToken: String, request: ParamGoodsToECommers
    ): ResultOperation

    suspend fun getGoodsQuantity(
        accessToken: String, idrgGoodsInventory: String
    ): ResultCountInCart

    suspend fun addDeliveryToCart(
        acessToken: String, request: DeliveryData
    ): ResultCart
}