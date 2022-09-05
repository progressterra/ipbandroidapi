package com.progressterra.ipbandroidapi.api.ipbcollaborationcoreapi

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.api.ipbcollaborationcoreapi.models.*
import com.progressterra.ipbandroidapi.core.NetworkService

internal class IPBCollaborationCoreImpl : IPBCollaborationCore.Cart,
    IPBCollaborationCore.Enterprise, IPBCollaborationCore.Offer, IPBCollaborationCore.News,
    IPBCollaborationCore.Shop, IPBCollaborationCore.Product {

    private val networkService: NetworkService = NetworkService.Base()

    private val cartApi =
        networkService.createService(
            IPBCollaborationCoreApi.Cart::class.java,
            URL.COLLABORATION_CORE_URL
        )

    private val entApi =
        networkService.createService(
            IPBCollaborationCoreApi.Enterprise::class.java,
            URL.COLLABORATION_CORE_URL
        )

    private val offerApi =
        networkService.createService(
            IPBCollaborationCoreApi.Offer::class.java,
            URL.COLLABORATION_CORE_URL
        )

    private val newsApi =
        networkService.createService(
            IPBCollaborationCoreApi.News::class.java,
            URL.COLLABORATION_CORE_URL
        )

    private val shopApi =
        networkService.createService(
            IPBCollaborationCoreApi.Shop::class.java,
            URL.COLLABORATION_CORE_URL
        )

    private val productApi =
        networkService.createService(
            IPBCollaborationCoreApi.Product::class.java,
            URL.COLLABORATION_CORE_URL
        )

    override suspend fun applyBonusesToCart(
        accessToken: String,
        bonusesQuantity: Int
    ): ProductsInBasketResponse {
        return cartApi.applyBonusesForCart(bonusesQuantity.toString(), accessToken)
    }

    override suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse {
        return cartApi.confirmOrder(accessToken)
    }

    override suspend fun getEnterpriseDetail(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        IDEnterprise: String
    ): ResultEnterpriseData {
        return entApi.getEnterpriseDetail(AccessToken, latitude, longitude, IDEnterprise)
    }

    override suspend fun getEnterpriseByRecID(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        idKindOf: Array<String>
    ): ResultListEnterpriseData {
        return entApi.getEnterpriseByRecID(AccessToken, latitude, longitude, idKindOf)
    }

    override suspend fun getEnterpriseFiltered(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        filterRequest: FilterAndSortRequest
    ): ResultListEnterpriseData {
        return entApi.getEnterpriseFiltered(
            AccessToken,
            latitude,
            longitude,
            filterRequest.convert()
        )
    }

    override suspend fun getOffersByEnterpriseID(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        IDCategory: String
    ): ResultOfferList {
        return offerApi.getOffersByEnterpriseID(AccessToken, latitude, longitude, IDCategory)
    }

    override suspend fun getOffersList(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        ListIDCities: String
    ): ResultOfferList {
        return offerApi.getOffersList(AccessToken, latitude, longitude, ListIDCities)
    }

    override suspend fun getOffersByRecID(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        idKindOf: Array<String>
    ): ResultOfferList {
        return offerApi.getOffersByRecID(AccessToken, latitude, longitude, idKindOf)
    }

    override suspend fun getOffersFiltered(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        filterRequest: FilterAndSortRequest
    ): ResultOfferList {
        return offerApi.getOffersFiltered(AccessToken, latitude, longitude, filterRequest.convert())
    }

    override suspend fun getPostIdByRecID(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        idKindOf: Array<String>
    ): ResultRGNewsList {
        return newsApi.getPostIdByRecID(AccessToken, latitude, longitude, idKindOf)
    }

    override suspend fun getPostsByEnterprise(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        IDEnterprise: String
    ): ResultRGNewsList {
        return newsApi.getPostsByEnterprise(AccessToken, latitude, longitude, IDEnterprise)
    }

    override suspend fun getShopList(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        IDEnterprise: String
    ): ResultListShop {
        return shopApi.getShopList(AccessToken, latitude, longitude, IDEnterprise)
    }

    override suspend fun getGoodsList(
        AccessToken: String,
        latitude: Double,
        longitude: Double,
        page: Int,
        pageSize: Int,
        filterRequest: FilterAndSortRequest
    ): ProductPageResponse {
        return productApi.getGoodsList(
            AccessToken,
            latitude,
            longitude,
            page,
            pageSize,
            filterRequest.convert()
        )
    }
}