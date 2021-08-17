package com.progressterra.ipbandroidapi.remoteData.ipbmediadatacore

import com.progressterra.ipbandroidapi.remoteData.ipbmediadatacore.models.UploadImageResponse
import okhttp3.MultipartBody

interface Ipbmediadatacore {
    suspend fun uploadImage(
        accessToken: String,
        alias: String = "userdata",
        tag: String = "0",
        image: MultipartBody.Part
    ): UploadImageResponse
}

fun Ipbmediadatacore(): Ipbmediadatacore = IpbmediadatacoreImpl()