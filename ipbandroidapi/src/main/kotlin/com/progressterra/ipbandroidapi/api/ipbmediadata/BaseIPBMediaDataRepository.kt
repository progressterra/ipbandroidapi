package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException
import okhttp3.MultipartBody
import java.io.InputStream

internal class BaseIPBMediaDataRepository(
    handleException: HandleException,
    private val service: IPBMediaDataService
) : IPBMediaDataRepository, AbstractRepository(handleException) {

    override suspend fun deleteMediaData(
        accessToken: String,
        idRGEntitytMediaData: String
    ): Result<Unit> = handle {
        val response = service.deleteMediaData(accessToken, idRGEntitytMediaData)
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
    ): Result<DataMediaData?> = handle {
        val response =
            service.attachToEntity(
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
    ): Result<List<DataMediaData>?> = handle {
        val response = service.attachedToEntity(accessToken, idEntity)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.dataList
    }

    override suspend fun downloadFile(accessToken: String, url: String): Result<InputStream> =
        handle {
            service.downloadFile(accessToken, url)
        }.map { it.byteStream() }
}

//TODO is access token necessary?