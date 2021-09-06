package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ImplementBonusRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.SetDeliveryAddressRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.SetDeliveryCommentaryRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.cart.ChangeProductCountInCartRequest
import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class IECommersCoreImpl : IECommersCore.Product, IECommersCore.Cart {
    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        IECommersCoreApi::class.java,
        NetworkSettings.IECOMMERS_CORE_URL
    )

    override suspend fun getRGGoodsInventoryExtListByIds(
        accessToken: String,
        idsList: List<String>
    ): ProductPageResponse {
        return api.getProductsByIds(accessToken, idsList)
    }

    override suspend fun applyBonusesToCart(
        accessToken: String,
        bonusesQuantity: Int
    ): ProductsInBasketResponse {
        return api.implementBonus(accessToken, ImplementBonusRequest(bonusesQuantity))
    }

    override suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse {
        return api.getProductsInCart(accessToken)
    }

    override suspend fun removeProductFromCart(
        accessToken: String,
        productId: String
    ): ProductsInBasketResponse {
        return api.removeProductFromCartWithFullResponseModel(accessToken, productId)
    }

    override suspend fun removeProductFromCartWithBaseResponse(
        accessToken: String,
        productId: String,
        sellerId: String,
        productCount: Int
    ): BaseResponse {
        return api.removeProductFromCart(
            ChangeProductCountInCartRequest(
                productId,
                productCount,
                sellerId
            ), accessToken
        )
    }

    override suspend fun addToCart(
        accessToken: String,
        productId: String,
        sellerId: String,
        productCount: Int
    ): ProductsInBasketResponse {
        return api.addProductToCart(
            ChangeProductCountInCartRequest(
                productId,
                productCount,
                sellerId
            ), accessToken
        )
    }

    override suspend fun cancelBonusesImplementation(accessToken: String): ProductsInBasketResponse {
        return api.cancelBonusesImplementation(accessToken)
    }

    override suspend fun setCommentary(accessToken: String, commentary: String): BaseResponse {
        return api.setDeliveryCommentary(
            accessToken, SetDeliveryCommentaryRequest(commentary)
        )
    }

    override suspend fun setDeliveryAddress(
        accessToken: String,
        idAddress: String,
        addressString: String
    ): BaseResponse {
        return api.setDeliveryAddress(
            accessToken = accessToken,
            SetDeliveryAddressRequest(
                accessToken = accessToken,
                idAddress = idAddress,
                addressString = addressString
            )
        )
    }

    override suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse {
        return api.confirmOrder(accessToken)
    }
}