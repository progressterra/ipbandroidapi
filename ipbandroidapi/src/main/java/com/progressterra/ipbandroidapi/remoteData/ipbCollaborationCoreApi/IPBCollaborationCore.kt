package com.progressterra.ipbandroidapi.remoteData.ipbCollaborationCoreApi

import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart.ProductsInBasketResponse
import retrofit2.Response

/**
 * http://84.201.184.154:5091/docsapi/v1/index.html
 */

interface IPBCollaborationCore {
    interface Cart {
        suspend fun applyBonusesToCart(
            accessToken: String,
            bonusesQuantity: Int
        ): ProductsInBasketResponse

        suspend fun confirmOrder(
            accessToken: String
        ): ProductsInBasketResponse
    }

    companion object {
        fun Cart(): IPBCollaborationCore.Cart = IPBCollaborationCoreImpl()
    }
}