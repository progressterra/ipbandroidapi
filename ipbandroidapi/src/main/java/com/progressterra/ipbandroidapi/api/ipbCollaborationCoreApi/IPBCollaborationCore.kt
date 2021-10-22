package com.progressterra.ipbandroidapi.api.ipbCollaborationCoreApi

import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.api.ipbCollaborationCoreApi.models.*

/**
 * http://84.201.188.117:5091/docsapi/v1/index.html
 */

interface IPBCollaborationCore {
    interface Cart {

        /**
         * Применяет бонуссы в указанном количестве к корзине клиента. Если передать 0, то применяется все доступные бонусы
         */
        suspend fun applyBonusesToCart(
            accessToken: String,
            bonusesQuantity: Int
        ): ProductsInBasketResponse


        /**
         * Корзина превращается в заказы - сколько организаций, столько и заказов
         */
        suspend fun confirmOrder(
            accessToken: String
        ): ProductsInBasketResponse
    }

    interface Enterprise {
        /**
         * Выдает данные организации по ее идентификатору
         */
        suspend fun getEnterpriseDetail(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            IDEnterprise: String
        ): ResultEnterpriseData

        /**
         * Выдает idEnterprise по recId
         */
        suspend fun getEnterpriseByRecID(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            idKindOf: Array<String>
        ): ResultListEnterpriseData

        /**
         *  Вовзвращает список организаций удовлетворяющих переданному фильтру
         */
        suspend fun getEnterpriseFiltered(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            filterRequest: FilterAndSortRequest
        ): ResultListEnterpriseData
    }

    interface Offer {
        /**
         * Выдает активные предложения для конкретной организации
         */
        suspend fun getOffersByEnterpriseID(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            IDCategory: String
        ): ResultOfferList

        /**
         * Для переданных городов выдает активные предложения
         */
        suspend fun getOffersList(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            ListIDCities: String
        ): ResultOfferList

        /**
         *  Возвращает список объектов предложений по переданным ID
         */
        suspend fun getOffersByRecID(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            idKindOf: Array<String>
        ): ResultOfferList

        /**
         *  Возвращает список акций (предложений) ото всех организации в зависимости от переданного фильтра
         */
        suspend fun getOffersFiltered(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            filterRequest: FilterAndSortRequest
        ): ResultOfferList
    }

    interface News {
        /**
         *  Возвращает список объектов "постов" по переданным ID
         */
        suspend fun getPostIdByRecID(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            idKindOf: Array<String>
        ): ResultRGNewsList

        /**
         *  Выдает активные "посты" для конкретной организации
         */
        suspend fun getPostsByEnterprise(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            IDEnterprise: String
        ): ResultRGNewsList
    }

    interface Shop {
        /**
         *  Выдает список магазинов организации
         */
        suspend fun getShopList(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            IDEnterprise: String
        ): ResultListShop
    }

    interface Product {
        /**
         *  Выдаем список номенклатуры согласно переданному фильтру
         */
        suspend fun getGoodsList(
            AccessToken: String,
            latitude: Double,
            longitude: Double,
            page: Int,
            pageSize: Int,
            filterRequest: FilterAndSortRequest
        ): ProductPageResponse
    }

    companion object {
        fun Cart(): Cart = IPBCollaborationCoreImpl()
        fun Enterprise(): Enterprise = IPBCollaborationCoreImpl()
        fun Offer(): Offer = IPBCollaborationCoreImpl()
        fun News(): News = IPBCollaborationCoreImpl()
        fun Shop(): Shop = IPBCollaborationCoreImpl()
        fun Product(): Product = IPBCollaborationCoreImpl()
    }
}