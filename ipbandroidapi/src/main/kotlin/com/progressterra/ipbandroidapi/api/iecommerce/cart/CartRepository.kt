package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.api.iecommerce.model.DataRowInCart
import com.progressterra.ipbandroidapi.api.iecommerce.model.DeliveryData
import com.progressterra.ipbandroidapi.api.iecommerce.model.ExtDHSaleHead
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAddAddress
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamForAndComment
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamGoodsToECommers
import com.progressterra.ipbandroidapi.api.iecommerce.model.ParamImplementBonusV3

interface CartRepository {

    suspend fun implementBonus(
        accessToken: String, request: ParamImplementBonusV3
    ): Result<ExtDHSaleHead?>

    suspend fun getProductsInCart(accessToken: String): Result<ExtDHSaleHead?>

    suspend fun getOrderById(orderId: String): Result<ExtDHSaleHead?>

    suspend fun removeProductFromCart(
        request: ParamGoodsToECommers, accessToken: String
    ): Result<Unit>

    suspend fun removeProductFromCartWithFullResponseModel(
        accessToken: String, IDDRSaleRow: String
    ): Result<ExtDHSaleHead?>

    suspend fun removeNomenclatureFromCart(
        accessToken: String, idrfNomenclature: String
    ): Result<ExtDHSaleHead?>

    suspend fun addProductToCart(
        request: ParamGoodsToECommers, accessToken: String
    ): Result<ExtDHSaleHead?>

    suspend fun cancelBonusesImplementation(accessToken: String): Result<ExtDHSaleHead?>

    suspend fun setDeliveryAddress(
        accessToken: String, request: ParamForAddAddress
    ): Result<Unit>

    suspend fun setDeliveryCommentary(
        accessToken: String, request: ParamForAndComment
    ): Result<Unit>

    suspend fun confirmOrder(accessToken: String): Result<ExtDHSaleHead?>

    suspend fun fastAddToCart(
        accessToken: String, request: ParamGoodsToECommers
    ): Result<Unit>

    suspend fun getGoodsQuantity(
        accessToken: String, idrgGoodsInventory: String
    ): Result<DataRowInCart?>

    suspend fun addDeliveryToCart(
        acessToken: String, request: DeliveryData
    ): Result<ExtDHSaleHead?>
}