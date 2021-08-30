package com.progressterra.ipbandroidapi.remoteData.iProBonusApi

import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.Response


interface IProBonus {
    suspend fun getClientInfo(accessToken: String): ClientInfoResponse
    suspend fun updateClientInfo(
        accessToken: String,
        name: String,
        soname: String,
        patronymic: String
    ): ClientInfoResponse

    suspend fun getClientCity(accessToken: String): CityResponse

    interface Cart {
        suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse
        suspend fun removeProductFromCart(
            accessToken: String,
            productId: String
        ): ProductsInBasketResponse

        suspend fun removeProductFromCartWithBaseResponse(
            accessToken: String,
            productId: String,
            sellerId: String = "00000000-0000-0000-0000-000000000000",
            productCount: Int = 1
        ): BaseResponse

        suspend fun addToCart(
            accessToken: String,
            productId: String,
            sellerId: String = "00000000-0000-0000-0000-000000000000",
            productCount: Int = 1
        ): ProductsInBasketResponse

        suspend fun cancelBonusesImplementation(
            accessToken: String
        ): Response<ProductsInBasketResponse>
    }

    companion object {
        fun IProBonus(): IProBonus = IProBonusApiImpl()
    }
}