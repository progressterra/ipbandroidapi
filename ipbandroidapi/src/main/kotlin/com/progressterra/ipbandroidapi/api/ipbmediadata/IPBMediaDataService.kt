package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultDataList
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Streaming
import retrofit2.http.Url

/**
 * [Docs](http://84.201.188.117:5089/docsapi/v1/index.html)
 */
internal interface IPBMediaDataService {

    @Multipart
    @POST("/v7/mobile/entity")
    suspend fun attachToEntity(
        @Header("AccessToken") accessToken: String,
        @Query("idEntity") idEntity: String,
        @Query("typeContent") typeContent: Int,
        @Query("entityTypeName") entityTypeName: String,
        @Query("alias") alias: String,
        @Query("tag") tag: Int,
        @Part file: MultipartBody.Part
    ): DataMediaDataResultData

    @GET("/v7/mobile/{IDEntity}/list")
    suspend fun attachedToEntity(
        @Header("AccessToken") accessToken: String,
        @Path("IDEntity") idEntity: String
    ): DataMediaDataResultDataList

    @Streaming
    @GET
    suspend fun downloadFile(
        @Header("AccessToken") accessToken: String,
        @Url url: String
    ): ResponseBody
}
