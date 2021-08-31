package com.progressterra.ipbandroidapi.remoteData.iProBonusApi

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ChangeProductCountInCartRequest
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.UpdateUserInfoRequest
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class IProBonusApiImpl : IProBonus, IProBonus.Cart, IProBonus.Purchases {
    private val apbNetworkService: NetworkService = NetworkServiceImpl()
    private val ipbApi =
        apbNetworkService.createService(
            IProBonusApi::class.java,
            NetworkSettings.LIKEDISLIKE_ROOT_URL
        )

    override suspend fun getClientInfo(accessToken: String): ClientInfoResponse {
        return ipbApi.getClientInfo(accessToken)
    }

    override suspend fun updateClientInfo(
        accessToken: String,
        name: String,
        soname: String,
        patronymic: String
    ): ClientInfoResponse {
        return ipbApi.updatePersonalInfo(
            accessToken,
            UpdateUserInfoRequest(soname, name, patronymic)
        )
    }

    override suspend fun getClientCity(accessToken: String): CityResponse {
        return ipbApi.getCityClient(accessToken)
    }

    override suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse {
        return ipbApi.getProductsInCart(accessToken)
    }

    override suspend fun removeProductFromCart(
        accessToken: String,
        productId: String
    ): ProductsInBasketResponse {
        return ipbApi.removeProductFromCartWithFullResponseModel(accessToken, productId)
    }

    override suspend fun removeProductFromCartWithBaseResponse(
        accessToken: String,
        productId: String,
        sellerId: String,
        productCount: Int
    ): BaseResponse {
        return ipbApi.removeProductFromCart(
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
        return ipbApi.addProductToCart(
            ChangeProductCountInCartRequest(
                productId,
                productCount,
                sellerId
            ), accessToken
        )
    }

    override suspend fun cancelBonusesImplementation(accessToken: String): ProductsInBasketResponse {
        return ipbApi.cancelBonusesImplementation(accessToken)
    }

    override suspend fun getPurchasesList(accessToken: String): PurchasesResponse {
        return ipbApi.getPurchasesList(accessToken)
    }

    override suspend fun getPurchaseDetailInfo(purchaseId: String): PurchaseDetailInfoResponse {
        return ipbApi.getPurchaseDetailInfo(purchaseId)
    }
}

