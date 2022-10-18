package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultDataList
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.*

/**
 * [Docs](http://84.201.188.117:5089/docsapi/v1/index.html)
 */
internal interface IPBMediaDataService {

    @POST("/v7/mobile/entity")
    suspend fun attachToEntity(
        @Query("idEntity") idEntity: String,
        @Query("typeContent") typeContent: Int,
        @Query("entityTypeName") entityTypeName: String,
        @Query("alias") alias: String,
        @Query("tag") tag: Int,
        @Part file: MultipartBody.Part
    ): DataMediaDataResultData

    @GET("/v7/mobile/{IDEntity}/list")
    suspend fun attachedToEntity(
        @Path("IDEntity") idEntity: String
    ): DataMediaDataResultDataList

    @Streaming
    @GET
    suspend fun downloadFile(@Url url: String): ResponseBody
}
