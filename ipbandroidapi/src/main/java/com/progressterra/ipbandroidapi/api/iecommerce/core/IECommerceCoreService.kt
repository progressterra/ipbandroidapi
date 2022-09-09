package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogInfoResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductSetResponse
import retrofit2.http.*

/**
 * http://84.201.188.117:6023/docsapi/v1/index.html
 */
interface IECommerceCoreService {

    @GET("/iecommercecore/api/v1/productset/{Artikul}/{IDFeature}/size")
    suspend fun getProductSizeSet(
        @Path("Artikul") artikul: String,
        @Path("IDFeature") idFeature: String
    ): ProductSetResponse

    @POST("/iecommercecore/api/v1/products/bylistid/{AccessToken}")
    suspend fun getProductsByIds(
        @Path("AccessToken") accessToken: String,
        @Body idsList: List<String>
    ): ProductPageResponse

    @GET("/iecommercecore/api/v1/products/product/{IDRGGoodsInventory}")
    suspend fun getProductDetailByIDRG(
        @Path("IDRGGoodsInventory") idrgGoodsInventory: String
    ): ProductPageResponse

    @GET("/iecommercecore/api/v1/products/bycategory/{idCategory}/{accessToken}/{pageNumberIncome}/{pageSizeIncome}/{sortingField}/{sortingOrder}")
    suspend fun getProductsByCategory(
        @Path("accessToken") accessToken: String,
        @Path("idCategory") idCategory: String,
        @Path("pageNumberIncome") pageNumberIncome: Int,
        @Path("pageSizeIncome") pageSizeIncome: Int,
        @Path("sortingField") sortingField: Int,
        @Path("sortingOrder") sortingOrder: Int
    ): ProductPageResponse

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

    @GET("/iecommercecore/api/v1/productset/bycategory/{IDCategory}/{AccessToken}/{pageNumberIncome}/{pageSizeIncome}/{SortingField}/{SorttingOrder}")
    suspend fun getProductsByCategoryCollapsed(
        @Path("AccessToken") accessToken: String,
        @Path("IDCategory") idCategory: String,
        @Path("pageNumberIncome") pageNumberIncome: Int,
        @Path("pageSizeIncome") pageSizeIncome: Int,
        @Path("SortingField") sortingField: Int,
        @Path("SorttingOrder") sortingOrder: Int
    ): ProductPageResponse

    @GET("/iecommercecore/api/v1/erp/products/product/{IDRFNomenklatura}/{IDRFShop}")
    suspend fun getProductByNomenklatura(
        @Path("IDRFNomenklatura") nomenclatura: String,
        @Path("IDRFShop") idrfShop: String
    ): ProductPageResponse

    @GET("/iecommercecore/api/v1/erp/products/byshop/{IDShop}/{IDEnterpise}/{pageNumberIncome}/{pageSizeIncome}")
    @Headers("Content-Type: application/json")
    suspend fun getPartnersGoods(
        @Path("IDShop") idShop: String,
        @Path("IDEnterpise") idEnterprise: String,
        @Path("pageNumberIncome") pageNumber: Int,
        @Path("pageSizeIncome") pageSize: Int
    ): ProductPageResponse

    @GET("/iecommercecore/api/v1/catalog/{AccessToken}")
    suspend fun getCatalog(@Path("AccessToken") accessToken: String): CatalogResponse

    @POST("/iecommercecore/api/v1/catalog/web/listbyid")
    suspend fun getCategoryInfo(@Body ids: List<String>): CatalogInfoResponse
}