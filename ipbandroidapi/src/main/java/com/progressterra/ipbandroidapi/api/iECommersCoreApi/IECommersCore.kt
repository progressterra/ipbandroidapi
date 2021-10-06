package com.progressterra.ipbandroidapi.api.iECommersCoreApi

import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.CatalogResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.ProductSetResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.GoodsQuantityResponse
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

        /**
         * возвращает список доступных размеров для товара
         */
        suspend fun getGoodsSize(artikul: String, idFeature: String): ProductSetResponse

        /**
         * Возвращает конкретный продукт по идентификатору
         *
         * Важно! В правильно работающей системе должен возвращаться только один продукт.
         */
        suspend fun getGoodsDetailByIDRG(idrgGoodsInventory: String): ProductPageResponse

        /**
         * Выводит постранично продукты для указанной категории, для конкретного клиента
         *
         * @param idCategory Идентификатор категории
         * @param accessToken Ключ доступа клиента
         * @param pageNumberIncome Страница, которую выводим
         * @param pageSizeIncome Количество продуктов на страницее
         * @param sortingField Поля по которому производится сортировка. Если 0, то сортировки нет. [0,1,2]
         * @param sortingOrder Порядок сортировки. [0,1]
         * @return ProductPageResponse
         * @see ProductPageResponse
         */
        suspend fun getProductsByCategory(
            accessToken: String,
            idCategory: String,
            pageNumberIncome: Int,
            pageSizeIncome: Int,
            sortingField: Int,
            sortingOrder: Int
        ): ProductPageResponse

        /**
         * Осуществляет поиск и выводит постранично продукты для указанной категории, для конкретного клиента
         *
         * @param searchString Строка поиска
         * @param idCategory Идентификатор категории
         * @param accessToken Ключ доступ клиента
         * @param pageNumberIncome Страница, которую выводим
         * @param pageSizeIncome Количество продуктов на страницее
         * @param sortingField Поля по которому производится сортировка. Если 0, то сортировки нет. [0,1,2]
         * @param sortingOrder Порядок сортировки. [0,1]
         * @return ProductPageResponse
         * @see ProductPageResponse
         */
        suspend fun searchProductsByCategory(
            accessToken: String,
            searchString: String,
            idCategory: String,
            pageNumberIncome: Int,
            pageSizeIncome: Int,
            sortingField: Int,
            sortingOrder: Int
        ): ProductPageResponse

        /**
         * Осуществляет поиск и выводит постранично продукты для указанной категории, для конкретного клиента
         * Свернуто по размерам
         *
         * @param searchString Строка поиска
         * @param idCategory Идентификатор категории
         * @param accessToken Ключ доступ клиента
         * @param pageNumberIncome Страница, которую выводим
         * @param pageSizeIncome Количество продуктов на страницее
         * @param sortingField Поля по которому производится сортировка. Если 0, то сортировки нет. [0,1,2]
         * @param sortingOrder Порядок сортировки. [0,1]
         * @return ProductPageResponse
         * @see ProductPageResponse
         */
        suspend fun searchProductsByCategoryCollapsed(
            accessToken: String,
            searchString: String,
            idCategory: String,
            pageNumberIncome: Int,
            pageSizeIncome: Int,
            sortingField: Int,
            sortingOrder: Int
        ): ProductPageResponse


        /**
         * Выводит постранично продукты для указанной категории, для конкретного клиента
         * свернуто по размерам
         *
         * @param idCategory Идентификатор категории
         * @param accessToken Ключ доступа клиента
         * @param pageNumberIncome Страница, которую выводим
         * @param pageSizeIncome Количество продуктов на страницее
         * @param sortingField Поля по которому производится сортировка. Если 0, то сортировки нет. [0,1,2]
         * @param sortingOrder Порядок сортировки. [0,1]
         * @return ProductPageResponse
         * @see ProductPageResponse
         */
        suspend fun getProductsByCategoryCollapsed(
            accessToken: String,
            idCategory: String,
            pageNumberIncome: Int,
            pageSizeIncome: Int,
            sortingField: Int,
            sortingOrder: Int
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


        /**
         * Добавляет товар в корзину, но не возвращает саму корзину
         */
        suspend fun fastAddToCart(
            accessToken: String,
            idrgGoodsInventory: String,
            sellerId: String = "00000000-0000-0000-0000-000000000000",
            productCount: Int = 1
        ): BaseResponse


        /**
         * Возращает количество конкртеного товара в корзине
         */
        suspend fun getGoodsQuantity(
            accessToken: String, idrgGoodsInventory: String
        ): GoodsQuantityResponse
    }

    interface Catalog {
        suspend fun getCatalog(accessToken: String): CatalogResponse
    }

    companion object {
        fun Product(): Product = IECommersCoreImpl()
        fun Cart(): Cart = IECommersCoreImpl()
        fun Catalog(): Catalog = IECommersCoreImpl()
    }
}