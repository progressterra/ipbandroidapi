package com.progressterra.ipbandroidapi.api.ipbMediaDataCore

import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.MediaDataListResponse
import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.MediaDataResponse
import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.UploadImageResponse
import okhttp3.MultipartBody
import retrofit2.http.*

internal interface IpbMediaDataCoreApi {
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
}
