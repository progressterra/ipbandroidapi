package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultData
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.DataMediaDataResultDataList
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException
import okhttp3.MultipartBody
import okhttp3.ResponseBody

internal interface IPBMediaDataCloudDataSource {

    suspend fun attachToEntity(
        idEntity: String,
        typeContent: Int, entityTypeName: String,
        alias: String,
        tag: Int,
        file: MultipartBody.Part
    ): DataMediaDataResultData

    suspend fun attachedToEntity(
        idEntity: String
    ): DataMediaDataResultDataList

    suspend fun downloadFile(url: String): ResponseBody

    class Base(
        private val service: IPBMediaDataService,
        handleException: HandleException
    ) : IPBMediaDataCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun attachToEntity(
            idEntity: String,
            typeContent: Int,
            entityTypeName: String,
            alias: String,
            tag: Int,
            file: MultipartBody.Part
        ): DataMediaDataResultData = handle {
            service.attachToEntity(idEntity, typeContent, entityTypeName, alias, tag, file)
        }

        override suspend fun attachedToEntity(idEntity: String): DataMediaDataResultDataList =
            handle {
                service.attachedToEntity(idEntity)
            }

        override suspend fun downloadFile(url: String): ResponseBody = handle {
            service.downloadFile(url)
        }
    }
}