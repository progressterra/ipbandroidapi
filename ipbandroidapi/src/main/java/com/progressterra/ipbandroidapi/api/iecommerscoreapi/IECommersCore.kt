package com.progressterra.ipbandroidapi.api.iecommerscoreapi

import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.*
import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.cart.GoodsQuantityResponse
import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.shop.YooMoneyConfirmationResponse
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery.DeliveryMethodType
import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery.ServiceMethodType
import com.progressterra.ipbandroidapi.remotedata.DEFAULT_ID
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse


/**
 *  http://84.201.188.117:6023/docsapi/v1/index.html
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

        /**
         * Получение списка продуктов по номенклатуре. В списке должен приходить ОДИН товар
         * @param IDRFNomenklatura Номенклатура товара
         * @param IDRFShop Уникальный идентификатор магазина, по умолчанию можно использовать "00000000-0000-0000-0000-000000000000"
         */
        suspend fun getProductByNomenklatura(
            nomenclatura: String,
            idrfShop: String = DEFAULT_ID
        ): ProductPageResponse
    }

    interface ProductErp {

        /**
         *  Выдает товары по конкретному магазину и организации
         */
        suspend fun getPartnersGoods(
            idShop: String,
            idEnterprise: String,
            pageNumber: Int,
            pageSize: Int
        ): ProductPageResponse
    }

    interface Cart {

        /**
         * Применение бонусов к корзине клиента
         */
        suspend fun applyBonusesToCart(
            accessToken: String,
            bonusesQuantity: Int
        ): ProductsInBasketResponse

        /**
         *  Возвращает текущую корзину клиента
         */
        suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse

        /**
         * Возвращает заказ по идентификатору
         */
        suspend fun getOrderById(orderId: String): ProductsInBasketResponse

        /**
         * Удаление строки товара из корзины
         */
        suspend fun removeProductFromCart(
            accessToken: String,
            productId: String
        ): ProductsInBasketResponse

        /**
         *  Удаление номенклатуры из корзины
         */
        suspend fun removeNomenclatureFromCart(
            accessToken: String,
            idrfNomenclature: String
        ): ProductsInBasketResponse

        /**
         *  Удаляет товар из корзины в указанном количестве, но не возвращает саму корзину
         */
        suspend fun fastRemoveFromCart(
            accessToken: String,
            idrgGoodsInventory: String,
            idSellerAmbassador: String = DEFAULT_ID,
            productCount: Int = 1
        ): BaseResponse

        /**
         * Добавляет товар в корзину, но не возвращает саму корзину
         */
        suspend fun fastAddToCart(
            accessToken: String,
            idrgGoodsInventory: String,
            idSellerAmbassador: String = DEFAULT_ID,
            productCount: Int = 1
        ): BaseResponse


        /**
         * Добавляет заданное количество товара в корзину
         */
        suspend fun addToCart(
            accessToken: String,
            productId: String,
            sellerId: String = DEFAULT_ID,
            productCount: Int = 1
        ): ProductsInBasketResponse

        /**
         *  Отменяет применение бонусов в корзине
         */
        suspend fun cancelBonusesImplementation(
            accessToken: String
        ): ProductsInBasketResponse


        /**
         * Добавляет комментарий клиента к заказу
         */
        suspend fun setCommentary(
            accessToken: String,
            commentary: String
        ): BaseResponse

        /**
         *  Добавляет адрес доставки
         */
        suspend fun setDeliveryAddress(
            accessToken: String,
            idAddress: String,
            addressString: String
        ): BaseResponse

        /**
         * Устанавливает признак того, что заказ подтвержден пользователем
         */
        suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse

        /**
         * Возращает количество конкртеного товара в корзине
         */
        suspend fun getGoodsQuantity(
            accessToken: String, idrgGoodsInventory: String
        ): GoodsQuantityResponse

        /**
         * Добавляет доставку в заказ
         * idrgGoodsInventory для:
         * Собственная доставка: b2842d16-1780-4b21-bf9e-043ac525bab7
         * IML: 706ab89f-e220-4c61-a8e9-d7178c422314
         * СДЭК: a236b46f-2f54-4cb1-a119-484d11bb827d
         */
        suspend fun addDeliveryToCart(
            accessToken: String,
            deliveryServiceId: DeliveryServiceId,
            displayName: String,
            calculatedPrice: Double,
            comment: String,
            methodType: DeliveryMethodType,
            serviceType: ServiceMethodType,
            pickUpPoint: String? = null
        ): ProductsInBasketResponse
    }

    interface Catalog {

        /**
         * Выводит каталог
         */
        suspend fun getCatalog(accessToken: String): CatalogResponse

        suspend fun getCatalogInfoById(ids: List<String>): CatalogInfoResponse
    }

    interface Shop {

        /**
         * Оплата через Ю-мани. Отправка данных платежа на сервер
         */
        suspend fun sendYooMoneyToken(
            accessToken: String,
            paymentToken: String,
            amount: Double,
        ): YooMoneyConfirmationResponse

        /**
         * Проверка состояния оплаты. Если пришел статус успеха, считаем платеж совершенным
         */
        suspend fun getPaymentConfirmation(cartId: String): BaseResponse
    }

    companion object {
        fun Product(): Product = IECommersCoreImpl()
        fun ProductErp(): ProductErp = IECommersCoreImpl()
        fun Cart(): Cart = IECommersCoreImpl()
        fun Catalog(): Catalog = IECommersCoreImpl()
        fun Shop(): Shop = IECommersCoreImpl()
    }
}