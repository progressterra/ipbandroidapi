package com.progressterra.ipbandroidapi.api.ipbfavpromoreccore

import com.progressterra.ipbandroidapi.api.ipbfavpromoreccore.models.IDKindOfResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * http://84.201.188.117:5095/docsapi/v1/index.html
 */
interface IPBFavPromoRecService {

    @GET("/promo/mobile/list/{IDKindOf}")
    suspend fun getIDKindOf(@Path("IDKindOf") iDKindOf: String): IDKindOfResponse

    @GET("/clientfavorites/mobile/list/{AccessToken}/{TypeOfEntity}")
    suspend fun getClientEntityByType(
        @Path("AccessToken") accessToken: String,
        @Path("TypeOfEntity") type: Int
    ): IDKindOfResponse

    @POST("/clientfavorites/mobile/add/{AccessToken}/{IDEntity}/{TypeOfEntity}")
    suspend fun addToFavorite(
        @Path("AccessToken") accessToken: String,
        @Path("IDEntity") idEntity: String,
        @Path("TypeOfEntity") type: Int
    ): BaseResponse

    @POST("/clientfavorites/mobile/remove/{AccessToken}/{IDEntity}")
    suspend fun removeFromFavorite(
        @Path("AccessToken") accessToken: String,
        @Path("IDEntity") idEntity: String
    ): BaseResponse
}