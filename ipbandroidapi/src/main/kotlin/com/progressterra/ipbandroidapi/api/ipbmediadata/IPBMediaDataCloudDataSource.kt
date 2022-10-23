package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.checklist.model.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultDataList
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.Header
import retrofit2.http.Path

internal interface IPBMediaDataCloudDataSource {

    suspend fun attachToEntity(
        accessToken: String,
        idEntity: String,
        typeContent: Int, entityTypeName: String,
        alias: String,
        tag: Int,
        file: MultipartBody.Part
    ): DataMediaDataResultData

    suspend fun attachedToEntity(
        accessToken: String,
        idEntity: String
    ): DataMediaDataResultDataList

    suspend fun downloadFile(
        accessToken: String,
        url: String
    ): ResponseBody

    suspend fun deleteMediaData(
        accessToken: String,
        idRGEntitytMediaData: String
    ): EmptyResultOperationResultData

    class Base(
        private val service: IPBMediaDataService,
        handleException: HandleException
    ) : IPBMediaDataCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun deleteMediaData(
            accessToken: String,
            idRGEntitytMediaData: String
        ): EmptyResultOperationResultData = handle {
            service.deleteMediaData(accessToken, idRGEntitytMediaData)
        }

        override suspend fun attachToEntity(
            accessToken: String,
            idEntity: String,
            typeContent: Int,
            entityTypeName: String,
            alias: String,
            tag: Int,
            file: MultipartBody.Part
        ): DataMediaDataResultData = handle {
            service.attachToEntity(
                accessToken,
                idEntity,
                typeContent,
                entityTypeName,
                alias,
                tag,
                file
            )
        }

        override suspend fun attachedToEntity(
            accessToken: String,
            idEntity: String
        ): DataMediaDataResultDataList =
            handle {
                service.attachedToEntity(accessToken, idEntity)
            }

        override suspend fun downloadFile(accessToken: String, url: String): ResponseBody = handle {
            service.downloadFile(accessToken, url)
        }
    }
}