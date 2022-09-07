package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.models.MediaDataListResponse
import com.progressterra.ipbandroidapi.api.ipbmediadata.models.MediaDataResponse
import com.progressterra.ipbandroidapi.api.ipbmediadata.models.UploadImageResponse
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.*

/**
 * http://84.201.188.117:5089/docsapi/v1/index.html
 */
interface IPBMediaDataService {

    @Multipart
    @POST("/mobile/{AccessToken}/image/{Alias}/{Tag}")
    suspend fun uploadImage(
        @Path("AccessToken") accessToken: String,
        @Path("Alias") alias: String,
        @Path("Tag") tag: String,
        @Part image: MultipartBody.Part
    ): UploadImageResponse

    @GET("/mobile/{IDEntity}/list")
    suspend fun getMediaDataListByEntity(@Path("IDEntity") idEntity: String): MediaDataListResponse

    @GET("/mobile/{IDRGEntitytMediaData}")
    suspend fun getMediaDataById(@Path("IDRGEntitytMediaData") mediaDataId: String): MediaDataResponse

    @Streaming
    @GET
    suspend fun downloadFile(@Url url: String): ResponseBody
}
