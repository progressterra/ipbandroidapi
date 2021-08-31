package com.progressterra.ipbandroidapi.remoteData.ipbCollaborationCoreApi

import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ProductsInBasketResponse
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IPBCollaborationCoreApi {
    /**
     * Применяет бонуссы в указанном количестве к корзине клиента. Если передать 0, то применяется все доступные бонусы
     */
    @POST("/collaboration/cart/mobile/implementbonus/{AccessToken}/{SumPaymentBonus}")
    suspend fun applyBonusesForCart(
        @Path("SumPaymentBonus") bonusesCount: String,
        @Path("AccessToken") accessToken: String
    ): ProductsInBasketResponse

    /**
     * Корзина превращается в заказы - сколько организаций, столько и заказов
     */
    @POST("/collaboration/cart/mobile/confirmorder/{AccessToken}")
    suspend fun confirmOrder(@Path("AccessToken") accessToken: String): ProductsInBasketResponse
}