package com.progressterra.ipbandroidapi.api.ipbMediaDataCore

import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.UploadImageResponse
import okhttp3.MultipartBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

internal interface IpbMediaDataCoreApi {
    @Multipart
    @POST("/mobile/{AccessToken}/image/{Alias}/{Tag}")
    suspend fun uploadImage(
        @Path("AccessToken") accessToken: String,
        @Path("Alias") alias: String,
        @Path("Tag") tag: String,
        @Part image: MultipartBody.Part
    ): UploadImageResponse
}
