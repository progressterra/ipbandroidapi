package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaData
import com.progressterra.ipbandroidapi.exception.BadRequestException
import okhttp3.MultipartBody
import java.io.InputStream

internal class BaseIPBMediaDataRepository(
    private val cloudDataSource: IPBMediaDataCloudDataSource
) : IPBMediaDataRepository {

    override suspend fun deleteMediaData(
        accessToken: String,
        idRGEntitytMediaData: String
    ): Result<Unit> = runCatching {
        val response = cloudDataSource.deleteMediaData(accessToken, idRGEntitytMediaData)
        if (response.result?.status != 0)
            throw BadRequestException()
    }

    override suspend fun attachToEntity(
        accessToken: String,
        idEntity: String,
        typeContent: Int,
        entityTypeName: String,
        alias: String,
        tag: Int,
        file: MultipartBody.Part
    ): Result<DataMediaData?> = runCatching {
        val response =
            cloudDataSource.attachToEntity(
                accessToken,
                idEntity,
                typeContent,
                entityTypeName,
                alias,
                tag,
                file
            )
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.data
    }

    override suspend fun attachedToEntity(
        accessToken: String,
        idEntity: String
    ): Result<List<DataMediaData>?> = runCatching {
        val response = cloudDataSource.attachedToEntity(accessToken, idEntity)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.dataList
    }

    override suspend fun downloadFile(accessToken: String, url: String): Result<InputStream> =
        runCatching {
            cloudDataSource.downloadFile(accessToken, url)
        }.map { it.byteStream() }
}

//TODO is access token necessary?