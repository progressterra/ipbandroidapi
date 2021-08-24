package com.progressterra.ipbandroidapi.remoteData.ipbFavPromoRecCore

import com.progressterra.ipbandroidapi.remoteData.ipbFavPromoRecCore.models.IDKindOfResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IPBFavPromoRecCoreApi {
    /**
     * Возвращает список id соответствующих переданному идентификатору
     * @param IDKindOf
     */
    @GET("/promo/mobile/list/{IDKindOf}")
    suspend fun getIDKindOf(@Path("IDKindOf") IDKindOf: String): IDKindOfResponse

    /**
     * Получаем идентфиикаторы сущности переданного типа для указанного клиента
     * @param type: 0 - ENTERPRISE
     *            : 1 - PRODUCT
     *            : 2 - OFFER
     *            : 3 - POST
     */
    @GET("/clientfavorites/mobile/list/{AccessToken}/{TypeOfEntity}")
    @Headers("Content-Type: application/json")
    suspend fun getClientEntityByType(
        @Path("AccessToken") accessToken: String,
        @Path("TypeOfEntity") type: Int
    ): IDKindOfResponse

    /**
     *  Добавляем в избранное клиента сущность
     */
    @POST("/clientfavorites/mobile/add/{AccessToken}/{IDEntity}/{TypeOfEntity}")
    suspend fun addToFavorite(
        @Path("AccessToken") accessToken: String,
        @Path("IDEntity") idEntity: String,
        @Path("TypeOfEntity") type: Int
    ): BaseResponse

    /**
     * Удаляем из избранного клиента сущность
     */
    @POST("/clientfavorites/mobile/remove/{AccessToken}/{IDEntity}")
    suspend fun removeFromFavorite(
        @Path("AccessToken") accessToken: String,
        @Path("IDEntity") idEntity: String
    ): BaseResponse
}