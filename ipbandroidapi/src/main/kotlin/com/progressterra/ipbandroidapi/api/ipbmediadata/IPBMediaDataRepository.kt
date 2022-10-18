package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaData
import okhttp3.MultipartBody
import java.io.InputStream

interface IPBMediaDataRepository {

    suspend fun attachToEntity(
        idEntity: String,
        typeContent: Int, entityTypeName: String,
        alias: String,
        tag: Int,
        file: MultipartBody.Part
    ): Result<DataMediaData?>

    suspend fun attachedToEntity(
        idEntity: String
    ): Result<List<DataMediaData>?>

    suspend fun downloadFile(url: String): Result<InputStream>
}
