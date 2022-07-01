package com.progressterra.ipbandroidapi.api.iECommersCoreApi

import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.*
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.ChangeProductCountInCartRequest
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.GoodsQuantityResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.shop.PaymentTokenRequest
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.shop.YooMoneyConfirmationResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.http.*

internal interface IECommersCoreApi {

    interface Cart {
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/implementbonus")
        suspend fun implementBonus(
            @Path("AccessToken") accessToken: String,
            @Body implementBonusRequest: ImplementBonusRequest
        ): ProductsInBasketResponse

        /**
         * получение списка товаров в корзине для текущего пользователя
         */
        @GET("/iecommercecore/api/v3/cart/{AccessToken}")
        suspend fun getProductsInCart(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

        /**
         * Возвращает заказ по идентификатору
         */
        @GET("/iecommercecore/api/v3/cart/order/{IDHSalaHead}")
        suspend fun getOrderById(@Path("IDHSalaHead") orderId: String): ProductsInBasketResponse

        /**
         * удаление заданного количества товара из корзины, но возвращает только статус успешности
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/goods/count/remove")
        suspend fun removeProductFromCart(
            @Body changeProductCountInCartRequest: ChangeProductCountInCartRequest,
            @Path("AccessToken") accessToken: String
        ): BaseResponse

        /**
         *  удаление заданного количества товара из корзины, но возвращает модель корзины полностью
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/removedrfromcart/{IDDRSaleRow}")
        suspend fun removeProductFromCartWithFullResponseModel(
            @Path("AccessToken") accessToken: String,
            @Path("IDDRSaleRow") IDDRSaleRow: String
        ): ProductsInBasketResponse


        /**
         * Удаляет все строки в которых есть данная номенклатура. Используется для удаления всех товаров данной номенклатуры из корзины
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/removenomenklaturefromcart/{IDRFNomenclature}")
        suspend fun removeNomenclatureFromCart(
            @Path("AccessToken") accessToken: String,
            @Path("IDRFNomenclature") idrfNomenclature: String
        ): ProductsInBasketResponse

        /**
         * добавление заданного количества товара в корзину
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/addtocart")
        suspend fun addProductToCart(
            @Body changeProductCountInCartRequest: ChangeProductCountInCartRequest,
            @Path("AccessToken") accessToken: String
        ): ProductsInBasketResponse

        /**
         *  Отменяет применение бонусов в корзине
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/cancelimplementbonus")
        suspend fun cancelBonusesImplementation(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

        /**
         *  Добавляет адрес доставки
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/address")
        suspend fun setDeliveryAddress(
            @Path("AccessToken") accessToken: String,
            @Body setDeliveryAddressRequest: SetDeliveryAddressRequest
        ): BaseResponse

        /**
         *  Добавляет комментарий клиента к заказу
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/comment")
        suspend fun setDeliveryCommentary(
            @Path("AccessToken") accessToken: String,
            @Body setDeliveryCommentaryRequest: SetDeliveryCommentaryRequest
        ): BaseResponse

        /**
         *  Устанавливает признак того, что заказ подтвержден
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/confirmorder")
        suspend fun confirmOrder(@Path("AccessToken") accessToken: String): ProductsInBasketResponse

        /**
         * Добавляет товар к корзине, но не возвращает корзину
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/goods/count")
        suspend fun fastAddToCart(
            @Path("AccessToken") accessToken: String,
            @Body request: ChangeProductCountInCartRequest
        ): BaseResponse

        /**
         * Возращает количество конкртеного товара в корзине
         */
        @GET("/iecommercecore/api/v3/cart/{AccessToken}/goods/{IDRGGoodsInventory}")
        suspend fun getGoodsQuantity(
            @Path("AccessToken") accessToken: String,
            @Path("IDRGGoodsInventory") idrgGoodsInventory: String
        ): GoodsQuantityResponse

        /**
         * Добавляет доставку в заказ
         * idrgGoodsInventory для:
         * Собственная доставка: b2842d16-1780-4b21-bf9e-043ac525bab7
         * IML: 706ab89f-e220-4c61-a8e9-d7178c422314
         * СДЭК: a236b46f-2f54-4cb1-a119-484d11bb827d
         */
        @POST("/iecommercecore/api/v3/cart/{AccessToken}/delivery")
        suspend fun addDeliveryToCart(
            @Path("AccessToken") acessToken: String,
            @Body createDeliveryOrderRequest: CreateDeliveryOrderRequest
        ): ProductsInBasketResponse
    }

    interface Product {
        /**
         * возвращает список доступных размеров для товара
         */
        @GET("/iecommercecore/api/v1/productset/{Artikul}/{IDFeature}/size")
        suspend fun getProductSizeSet(
            @Path("Artikul") artikul: String,
            @Path("IDFeature") idFeature: String
        ): ProductSetResponse

        /**
         * Получаем список продуктов по списку идентификаторов RGGoodsInventory
         */
        @POST("/iecommercecore/api/v1/products/bylistid/{AccessToken}")
        suspend fun getProductsByIds(
            @Path("AccessToken") accessToken: String,
            @Body idsList: List<String>
        ): ProductPageResponse

        /**
         * Возвращает конкретный продукт по идентификатору
         */
        @GET("/iecommercecore/api/v1/products/product/{IDRGGoodsInventory}")
        suspend fun getProductDetailByIDRG(
            @Path("IDRGGoodsInventory") idrgGoodsInventory: String
        ): ProductPageResponse

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
        @GET("/iecommercecore/api/v1/products/bycategory/{idCategory}/{accessToken}/{pageNumberIncome}/{pageSizeIncome}/{sortingField}/{sortingOrder}")
        suspend fun getProductsByCategory(
            @Path("accessToken") accessToken: String,
            @Path("idCategory") idCategory: String,
            @Path("pageNumberIncome") pageNumberIncome: Int,
            @Path("pageSizeIncome") pageSizeIncome: Int,
            @Path("sortingField") sortingField: Int,
            @Path("sortingOrder") sortingOrder: Int
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
         * @return
         */
        @GET("/iecommercecore/api/v1/products/search/{searchString}/{idCategory}/{accessToken}/{pageNumberIncome}/{pageSizeIncome}/{sortingField}/{sortingOrder}")
        suspend fun searchProductsByCategory(
            @Path("accessToken") accessToken: String,
            @Path("searchString") searchString: String,
            @Path("idCategory") idCategory: String,
            @Path("pageNumberIncome") pageNumberIncome: Int,
            @Path("pageSizeIncome") pageSizeIncome: Int,
            @Path("sortingField") sortingField: Int,
            @Path("sortingOrder") sortingOrder: Int
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
         * @return
         */
        @GET("/iecommercecore/api/v1/productset/search/{SearchString}/{IDCategory}/{AccessToken}/{pageNumberIncome}/{pageSizeIncome}/{SortingField}/{SorttingOrder}")
        suspend fun searchProductsByCategoryCollapsed(
            @Path("AccessToken") accessToken: String,
            @Path("SearchString") searchString: String,
            @Path("IDCategory") idCategory: String,
            @Path("pageNumberIncome") pageNumberIncome: Int,
            @Path("pageSizeIncome") pageSizeIncome: Int,
            @Path("SortingField") sortingField: Int,
            @Path("SorttingOrder") sortingOrder: Int
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
         * @return
         */
        @GET("/iecommercecore/api/v1/productset/bycategory/{IDCategory}/{AccessToken}/{pageNumberIncome}/{pageSizeIncome}/{SortingField}/{SorttingOrder}")
        suspend fun getProductsByCategoryCollapsed(
            @Path("AccessToken") accessToken: String,
            @Path("IDCategory") idCategory: String,
            @Path("pageNumberIncome") pageNumberIncome: Int,
            @Path("pageSizeIncome") pageSizeIncome: Int,
            @Path("SortingField") sortingField: Int,
            @Path("SorttingOrder") sortingOrder: Int
        ): ProductPageResponse

        /**
         * Получение списка продуктов по номенклатуре. В списке должен приходить ОДИН товар
         * @param IDRFNomenklatura Номенклатура товара
         * @param IDRFShop Уникальный идентификатор магазина, по умолчанию можно использовать "00000000-0000-0000-0000-000000000000"
         */
        @GET("/iecommercecore/api/v1/erp/products/product/{IDRFNomenklatura}/{IDRFShop}")
        suspend fun getProductByNomenklatura(
            @Path("IDRFNomenklatura") nomenclatura: String,
            @Path("IDRFShop") idrfShop: String
        ): ProductPageResponse
    }

    interface ProductErp {
        /**
         *  Выдает товары по конкретному магазину и организации
         */
        @GET("/iecommercecore/api/v1/erp/products/byshop/{IDShop}/{IDEnterpise}/{pageNumberIncome}/{pageSizeIncome}")
        @Headers("Content-Type: application/json")
        suspend fun getPartnersGoods(
            @Path("IDShop") idShop: String,
            @Path("IDEnterpise") idEnterprise: String,
            @Path("pageNumberIncome") pageNumber: Int,
            @Path("pageSizeIncome") pageSize: Int
        ): ProductPageResponse
    }

    interface Catalog {

        /**
         * Выводит каталог
         */
        @GET("/iecommercecore/api/v1/catalog/{AccessToken}")
        suspend fun getCatalog(@Path("AccessToken") accessToken: String): CatalogResponse

        /**
         * Catalog info
         */
        @POST("/iecommercecore/api/v1/catalog/web/listbyid")
        suspend fun getCategoryInfo(@Body ids: List<String>): CatalogInfoResponse
    }

    interface Shop {
        /**
         * Оплата через Ю-мани. Отправка данных платежа на сервер
         */
        @POST("iecommercecore/api/v1/yandexcash/payment/{AccessToken}")
        suspend fun sendYooMoneyToken(
            @Path("AccessToken") AccessToken: String,
            @Body data: PaymentTokenRequest
        ): YooMoneyConfirmationResponse

        /**
         * Проверка состояния оплаты. Если пришел статус успеха, считаем платеж совершенным
         */
        @GET("/iecommercecore/api/v1/yandexcash/payment/{CartID}")
        suspend fun getPaymentConfirmation(@Path("CartID") cartId: String): BaseResponse
    }
}