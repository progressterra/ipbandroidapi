package com.progressterra.ipbandroidapi.api.ipbfavpromorec

import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.ResultListIDPromo
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.ResultListIDRFCatalog
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.ResultOperation
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.ResultRFKindOfEntity
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5095/docsapi/v1/index.html)
 */
interface IPBFavPromoRecService {

    @GET("/promo/mobile/list/{IDKindOf}")
    suspend fun getIDKindOf(@Path("IDKindOf") iDKindOf: String): ResultListIDPromo

    @GET("/clientfavorites/mobile/list/{AccessToken}/{TypeOfEntity}")
    suspend fun getClientEntityByType(
        @Path("AccessToken") accessToken: String,
        @Path("TypeOfEntity") type: Int
    ): ResultListIDRFCatalog

    @POST("/clientfavorites/mobile/add/{AccessToken}/{IDEntity}/{TypeOfEntity}")
    suspend fun addToFavorite(
        @Path("AccessToken") accessToken: String,
        @Path("IDEntity") idEntity: String,
        @Path("TypeOfEntity") type: Int
    ): ResultOperation

    @POST("/clientfavorites/mobile/remove/{AccessToken}/{IDEntity}")
    suspend fun removeFromFavorite(
        @Path("AccessToken") accessToken: String,
        @Path("IDEntity") idEntity: String
    ): ResultOperation

    @GET("/kindofentity/{IDUnique}")
    suspend fun getCategoryInfo(@Path("IDUnique") idUnique: String): ResultRFKindOfEntity
}