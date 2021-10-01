package com.progressterra.ipbandroidapi.api.iECommersCoreApi

import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse


/**
 *  http://84.201.184.154:6023/docsapi/v1/index.html
 */
interface IECommersCore {

    interface Product {

        /**
         * @param idsList - список уникальный идентификаторов RGGoodsInventory товары которых хотим получить
         */
        suspend fun getRGGoodsInventoryExtListByIds(
            accessToken: String,
            idsList: List<String>
        ): ProductPageResponse
    }

    interface Cart {
        suspend fun applyBonusesToCart(
            accessToken: String,
            bonusesQuantity: Int
        ): ProductsInBasketResponse

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
        ): ProductsInBasketResponse

        suspend fun setCommentary(
            accessToken: String,
            commentary: String
        ): BaseResponse

        suspend fun setDeliveryAddress(
            accessToken: String,
            idAddress: String,
            addressString: String
        ): BaseResponse

        suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse
    }

    companion object {
        fun Product(): Product = IECommersCoreImpl()
        fun Cart(): Cart = IECommersCoreImpl()
    }
}