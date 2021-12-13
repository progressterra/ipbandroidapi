package com.progressterra.ipbandroidapi.api.iECommersCoreApi

import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.*
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.ChangeProductCountInCartRequest
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.GoodsQuantityResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart.ProductsInBasketResponse
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.shop.PaymentTokenRequest
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.shop.YooMoneyConfirmationResponse
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.DeliveryMethodType
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery.ServiceMethodType
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class IECommersCoreImpl : IECommersCore.Product, IECommersCore.Cart,
    IECommersCore.Catalog, IECommersCore.ProductErp, IECommersCore.Shop {
    private val networkService: NetworkService = NetworkServiceImpl()
    private val cartApi = networkService.createService(
        IECommersCoreApi.Cart::class.java,
        NetworkSettings.IECOMMERS_CORE_URL
    )
    private val productApi = networkService.createService(
        IECommersCoreApi.Product::class.java,
        NetworkSettings.IECOMMERS_CORE_URL
    )
    private val catalogApi = networkService.createService(
        IECommersCoreApi.Catalog::class.java,
        NetworkSettings.IECOMMERS_CORE_URL
    )
    private val productErp = networkService.createService(
        IECommersCoreApi.ProductErp::class.java,
        NetworkSettings.IECOMMERS_CORE_URL
    )
    private val shopApi = networkService.createService(
        IECommersCoreApi.Shop::class.java,
        NetworkSettings.IENTERPRISE_URL
    )

    /**
     * Product
     */
    override suspend fun getRGGoodsInventoryExtListByIds(
        accessToken: String,
        idsList: List<String>
    ): ProductPageResponse {
        return productApi.getProductsByIds(accessToken, idsList)
    }

    override suspend fun getGoodsSize(artikul: String, idFeature: String): ProductSetResponse {
        return productApi.getProductSizeSet(artikul, idFeature)
    }

    override suspend fun getGoodsDetailByIDRG(idrgGoodsInventory: String): ProductPageResponse {
        return productApi.getProductDetailByIDRG(idrgGoodsInventory)
    }

    override suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse {
        return productApi.getProductsByCategory(
            accessToken,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    override suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse {
        return productApi.searchProductsByCategory(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    override suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse {
        return productApi.getProductsByCategoryCollapsed(
            accessToken,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    override suspend fun getProductByNomenklatura(
        nomenclatura: String,
        idrfShop: String
    ): ProductPageResponse {
        return productApi.getProductByNomenklatura(nomenclatura, idrfShop)
    }

    override suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse {
        return productApi.searchProductsByCategoryCollapsed(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    /**
     *  Cart
     */
    override suspend fun applyBonusesToCart(
        accessToken: String,
        bonusesQuantity: Int
    ): ProductsInBasketResponse {
        return cartApi.implementBonus(accessToken, ImplementBonusRequest(bonusesQuantity))
    }

    override suspend fun getProductsInCart(accessToken: String): ProductsInBasketResponse {
        return cartApi.getProductsInCart(accessToken)
    }

    override suspend fun getOrderById(orderId: String): ProductsInBasketResponse {
        return cartApi.getOrderById(orderId)
    }

    override suspend fun removeProductFromCart(
        accessToken: String,
        productId: String
    ): ProductsInBasketResponse {
        return cartApi.removeProductFromCartWithFullResponseModel(accessToken, productId)
    }

    override suspend fun removeNomenclatureFromCart(
        accessToken: String,
        idrfNomenclature: String
    ): ProductsInBasketResponse {
        return cartApi.removeNomenclatureFromCart(accessToken, idrfNomenclature)
    }

    override suspend fun fastRemoveFromCart(
        accessToken: String,
        idrgGoodsInventory: String,
        idSellerAmbassador: String,
        productCount: Int
    ): BaseResponse {
        return cartApi.removeProductFromCart(
            ChangeProductCountInCartRequest(
                idrgGoodsInventory,
                productCount,
                idSellerAmbassador
            ), accessToken
        )
    }

    override suspend fun addToCart(
        accessToken: String,
        productId: String,
        sellerId: String,
        productCount: Int
    ): ProductsInBasketResponse {
        return cartApi.addProductToCart(
            ChangeProductCountInCartRequest(
                productId,
                productCount,
                sellerId
            ), accessToken
        )
    }

    override suspend fun cancelBonusesImplementation(accessToken: String): ProductsInBasketResponse {
        return cartApi.cancelBonusesImplementation(accessToken)
    }

    override suspend fun setCommentary(accessToken: String, commentary: String): BaseResponse {
        return cartApi.setDeliveryCommentary(
            accessToken, SetDeliveryCommentaryRequest(commentary)
        )
    }

    override suspend fun setDeliveryAddress(
        accessToken: String,
        idAddress: String,
        addressString: String
    ): BaseResponse {
        return cartApi.setDeliveryAddress(
            accessToken = accessToken,
            SetDeliveryAddressRequest(
                accessToken = accessToken,
                idAddress = idAddress,
                addressString = addressString
            )
        )
    }

    override suspend fun confirmOrder(accessToken: String): ProductsInBasketResponse {
        return cartApi.confirmOrder(accessToken)
    }

    override suspend fun fastAddToCart(
        accessToken: String,
        idrgGoodsInventory: String,
        idSellerAmbassador: String,
        productCount: Int
    ): BaseResponse {
        return cartApi.fastAddToCart(
            accessToken,
            ChangeProductCountInCartRequest(idrgGoodsInventory, productCount, idSellerAmbassador)
        )
    }

    override suspend fun getGoodsQuantity(
        accessToken: String,
        idrgGoodsInventory: String
    ): GoodsQuantityResponse {
        return cartApi.getGoodsQuantity(accessToken, idrgGoodsInventory)
    }

    override suspend fun addDeliveryToCart(
        accessToken: String,
        deliveryServiceId: DeliveryServiceId,
        displayName: String,
        calculatedPrice: Double,
        rfMethodType: DeliveryMethodType,
        rfServiceType: ServiceMethodType,
        rdPickUpPoint: String?
    ): ProductsInBasketResponse {
        return cartApi.addDeliveryToCart(
            acessToken = accessToken,
            createDeliveryOrderRequest = CreateDeliveryOrderRequest(
                deliveryServiceId.id,
                displayName,
                calculatedPrice,
                rfMethodType.type,
                rfServiceType.type,
                rdPickUpPoint
            )
        )
    }

    /**
     *  Catalog
     */
    override suspend fun getCatalog(accessToken: String): CatalogResponse {
        return catalogApi.getCatalog(accessToken)
    }

    /**
     * Product for ERP
     */
    override suspend fun getPartnersGoods(
        idShop: String,
        idEnterprise: String,
        pageNumber: Int,
        pageSize: Int
    ): ProductPageResponse {
        return productErp.getPartnersGoods(idShop, idEnterprise, pageNumber, pageSize)
    }

    override suspend fun sendYooMoneyToken(
        accessToken: String,
        paymentToken: String,
        amount: Double
    ): YooMoneyConfirmationResponse {
        return shopApi.sendYooMoneyToken(accessToken, PaymentTokenRequest(amount, paymentToken))
    }

    override suspend fun getPaymentConfirmation(cartId: String): BaseResponse {
        return shopApi.getPaymentConfirmation(cartId)
    }
}