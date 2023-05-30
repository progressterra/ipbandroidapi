package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.checklist.model.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.FilterAndSort
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.RGEntitytMediaDataViewModelResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.RGEntitytMediaDataViewModelResultDataList
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.*

/**
 * [Docs](http://51.250.54.134:7089/swagger/index.html)
 */
internal interface IPBMediaDataService {

    @Multipart
    @POST("/mediadata/client")
    suspend fun attachToClient(
        @Header("AccessToken") accessToken: String,
        @Query("typeContent") typeContent: String,
        @Query("alias") alias: String,
        @Query("tag") tag: Int,
        @Part file: MultipartBody.Part
    ): RGEntitytMediaDataViewModelResultData

    @Multipart
    @POST("/mediadata/entity")
    suspend fun attachToEntity(
        @Header("AccessToken") accessToken: String,
        @Query("idEntity") idEntity: String,
        @Query("entityTypeName") entityTypeName: String,
        @Query("typeContent") typeContent: String,
        @Query("alias") alias: String,
        @Query("tag") tag: Int,
        @Part file: MultipartBody.Part
    ): RGEntitytMediaDataViewModelResultData

    @GET("/mediadata/entity/{iDEntity}/list")
    suspend fun attachedToEntity(
        @Header("AccessToken") accessToken: String,
        @Path("iDEntity") idEntity: String,
        @Body filterAndSort: FilterAndSort
    ): RGEntitytMediaDataViewModelResultDataList

    @Streaming
    @GET
    suspend fun downloadFile(
        @Header("AccessToken") accessToken: String,
        @Url url: String
    ): ResponseBody

    @DELETE("/mediadata/{idRGEntitytMediaData}")
    suspend fun deleteMediaData(
        @Header("AccessToken") accessToken: String,
        @Path("idRGEntitytMediaData") idRGEntitytMediaData: String
    ): EmptyResultOperationResultData
}
