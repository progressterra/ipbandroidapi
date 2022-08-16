package com.progressterra.ipbandroidapi.api.ipbcollaborationcoreapi

import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.api.ipbcollaborationcoreapi.models.*
import retrofit2.http.*

internal interface IPBCollaborationCoreApi {

    interface Cart {
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

    interface Enterprise {

        /**
         * Выдает данные организации по ее идентификатору
         */
        @GET("/mobile/enterprise/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
        @Headers("Content-Type: application/json")
        suspend fun getEnterpriseDetail(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Path("IDEnterprise") IDEnterprise: String
        ): ResultEnterpriseData

        /**
         * Выдает idEnterprise по recId
         */
        @POST("/mobile/enterprise/listbyid/{AccessToken}/{latitude}/{longitude}")
        @Headers("Content-Type: application/json")
        suspend fun getEnterpriseByRecID(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Body idKindOf: Array<String>,
        ): ResultListEnterpriseData

        /**
         *  Вовзвращает список организаций удовлетворяющих переданному фильтру
         */
        @POST("/mobile/enterprise/list/{AccessToken}/{latitude}/{longitude}")
        @Headers("Content-Type: application/json")
        suspend fun getEnterpriseFiltered(
            @Path("AccessToken") token: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Body filterRequest: FilterAndSortData
        ): ResultListEnterpriseData
    }

    interface Offer {

        /**
         * Выдает активные предложения для конкретной организации
         */
        @GET("/collaboration/offers/mobile/list/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
        @Headers("Content-Type: application/json")
        suspend fun getOffersByEnterpriseID(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Path("IDEnterprise") IDCategory: String
        ): ResultOfferList

        /**
         * Для переданных городов выдает активные предложения
         */
        @GET("/collaboration/offers/mobile/list/bycities/{AccessToken}/{latitude}/{longitude}/{ListIDCities}")
        @Headers("Content-Type: application/json")
        suspend fun getOffersList(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Path("ListIDCities") ListIDCities: String
        ): ResultOfferList

        /**
         *  Возвращает список объектов предложений по переданным ID
         */
        @POST("/collaboration/offers/mobile/listbyid/{AccessToken}/{latitude}/{longitude}")
        @Headers("Content-Type: application/json")
        suspend fun getOffersByRecID(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Body idKindOf: Array<String>,
        ): ResultOfferList

        /**
         *  Возвращает список акций (предложений) ото всех организации в зависимости от переданного фильтра
         */
        @POST("/collaboration/offers/mobile/list/{AccessToken}/{latitude}/{longitude}")
        @Headers("Content-Type: application/json")
        suspend fun getOffersFiltered(
            @Path("AccessToken") token: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Body filterRequest: FilterAndSortData
        ): ResultOfferList
    }

    interface News {

        /**
         *  Возвращает список объектов "постов" по переданным ID
         */
        @POST("/collaboration/news/mobile/listbyid/{AccessToken}/{latitude}/{longitude}")
        @Headers("Content-Type: application/json")
        suspend fun getPostIdByRecID(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Body idKindOf: Array<String>,
        ): ResultRGNewsList

        /**
         *  Выдает активные "посты" для конкретной организации
         */
        @GET("/collaboration/news/mobile/list/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
        @Headers("Content-Type: application/json")
        suspend fun getPostsByEnterprise(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Path("IDEnterprise") IDEnterprise: String
        ): ResultRGNewsList
    }

    interface Shop {

        /**
         *  Выдает список магазинов организации
         */
        @GET("/collaboration/category/mobile/list/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
        @Headers("Content-Type: application/json")
        suspend fun getShopList(
            @Path("AccessToken") AccessToken: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Path("IDEnterprise") IDEnterprise: String
        ): ResultListShop
    }

    interface Product {

        /**
         *  Выдаем список номенклатуры согласно переданному фильтру
         */
        @POST("/list/{AccessToken}/{latitude}/{longitude}/{pageNumberIncome}/{pageSizeIncome}")
        @Headers("Content-Type: application/json")
        suspend fun getGoodsList(
            @Path("AccessToken") token: String,
            @Path("latitude") latitude: Double,
            @Path("longitude") longitude: Double,
            @Path("pageNumberIncome") page: Int,
            @Path("pageSizeIncome") pageSize: Int,
            @Body filterAndSortData: FilterAndSortData
        ): ProductPageResponse
    }
}