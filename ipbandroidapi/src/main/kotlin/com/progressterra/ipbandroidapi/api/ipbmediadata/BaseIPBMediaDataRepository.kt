package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import okhttp3.MultipartBody
import java.io.InputStream

internal class BaseIPBMediaDataRepository(
    private val cloudDataSource: IPBMediaDataCloudDataSource
) : AbstractRepository(), IPBMediaDataRepository {

    override suspend fun attachToEntity(
        idEntity: String,
        typeContent: Int,
        entityTypeName: String,
        alias: String,
        tag: Int,
        file: MultipartBody.Part
    ): Result<DataMediaData?> = handle {
        val response = cloudDataSource.attachToEntity(idEntity, typeContent, entityTypeName, alias, tag, file)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.data
    }

    override suspend fun attachedToEntity(idEntity: String): Result<List<DataMediaData>?> = handle {
        val response = cloudDataSource.attachedToEntity(idEntity)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.dataList
    }

    override suspend fun downloadFile(url: String): Result<InputStream> = handle {
        cloudDataSource.downloadFile(url)
    }.map { it.byteStream() }
}