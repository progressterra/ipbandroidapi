package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.FilterAndSort
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.RGEntitytMediaDataViewModel
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException
import okhttp3.MultipartBody
import java.io.InputStream

internal class BaseIPBMediaDataRepository(
    handleException: HandleException, private val service: IPBMediaDataService
) : IPBMediaDataRepository, AbstractRepository(handleException) {

    override suspend fun deleteMediaData(
        accessToken: String, idRGEntitytMediaData: String
    ): Result<Unit> = handle {
        val response = service.deleteMediaData(accessToken, idRGEntitytMediaData)
        if (response.result?.status != 0) throw BadRequestException()
    }

    override suspend fun attachToClient(
        accessToken: String, typeContent: String, alias: String, tag: Int, file: MultipartBody.Part
    ): Result<RGEntitytMediaDataViewModel?> = handle {
        val response = service.attachToClient(
            accessToken, typeContent, alias, tag, file
        )
        if (response.result?.status != "success") throw BadRequestException()
        response
    }.map {
        it.data
    }

    override suspend fun attachToEntity(
        accessToken: String,
        idEntity: String,
        entityTypeName: String,
        typeContent: String,
        alias: String,
        tag: Int,
        file: MultipartBody.Part
    ): Result<RGEntitytMediaDataViewModel?> = handle {
        val response = service.attachToEntity(
            accessToken, idEntity, entityTypeName, typeContent, alias, tag, file
        )
        if (response.result?.status != "success") throw BadRequestException()
        response
    }.map {
        it.data
    }

    override suspend fun attachedToEntity(
        accessToken: String, idEntity: String, filterAndSort: FilterAndSort
    ): Result<List<RGEntitytMediaDataViewModel>?> = handle {
        val response = service.attachedToEntity(accessToken, idEntity, filterAndSort)
        if (response.result?.status != "success") throw BadRequestException()
        response
    }.map {
        it.dataList
    }

    override suspend fun downloadFile(accessToken: String, url: String): Result<InputStream> =
        handle {
            service.downloadFile(accessToken, url)
        }.map { it.byteStream() }
}
