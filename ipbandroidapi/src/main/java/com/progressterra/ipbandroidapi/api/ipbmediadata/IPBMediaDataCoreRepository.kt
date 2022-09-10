package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.MediaData
import okhttp3.MultipartBody
import java.io.InputStream

interface IPBMediaDataCoreRepository {

    suspend fun uploadImage(
        accessToken: String,
        alias: String = "userdata",
        tag: String = "0",
        image: MultipartBody.Part
    ): Result<MediaData>

    suspend fun getMediaDataListByEntity(idEntity: String): Result<List<MediaData>>

    suspend fun getMediaDataById(mediaDataId: String): Result<MediaData>

    suspend fun downloadFile(url: String): Result<InputStream>
}
