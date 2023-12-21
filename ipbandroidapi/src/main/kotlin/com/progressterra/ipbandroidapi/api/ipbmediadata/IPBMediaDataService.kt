package com.progressterra.ipbandroidapi.api.ipbmediadata

import okhttp3.MultipartBody
import okhttp3.ResponseBody
import com.progressterra.ipbandroidapi.api.ipbmediadata.models.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.ipbmediadata.models.RGEntitytMediaDataViewModelResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.models.RGEntitytMediaDataViewModelResultDataList
import retrofit2.http.Body
import retrofit2.http.DELETE
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
 * [Docs](http://51.250.54.134:7089/swagger/index.html)
 */
interface IPBMediaDataService {

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

    @POST("/mediadata/entity/{iDEntity}/list")
    suspend fun attachedToEntity(
        @Header("AccessToken") accessToken: String,
        @Path("iDEntity") idEntity: String,
        @Body filterAndSort: FilterAndSort
    ): RGEntitytMediaDataViewModelResultDataList

    @POST("/mediadata/client/list")
    suspend fun attachedToClient(
        @Header("AccessToken") accessToken: String,
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
