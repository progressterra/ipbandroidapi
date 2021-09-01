package com.progressterra.ipbandroidapi.remoteData.ipbCollaborationCoreApi

import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.cart.ProductsInBasketResponse

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
        fun Cart(): Cart = IPBCollaborationCoreImpl()
    }
}