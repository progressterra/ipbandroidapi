package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.MediaDataListResponse
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.MediaDataResponse
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.UploadImageResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException
import okhttp3.MultipartBody
import okhttp3.ResponseBody

internal interface IPBMediaDataCloudDataSource {

    suspend fun uploadImage(
        accessToken: String,
        alias: String,
        tag: String,
        image: MultipartBody.Part
    ): UploadImageResponse

    suspend fun getMediaDataListByEntity(idEntity: String): MediaDataListResponse

    suspend fun getMediaDataById(mediaDataId: String): MediaDataResponse

    suspend fun downloadFile(url: String): ResponseBody

    class Base(
        private val service: IPBMediaDataService,
        handleException: HandleException
    ) : IPBMediaDataCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun uploadImage(
            accessToken: String,
            alias: String,
            tag: String,
            image: MultipartBody.Part
        ): UploadImageResponse = handle {
            service.uploadImage(accessToken, alias, tag, image)
        }

        override suspend fun getMediaDataListByEntity(idEntity: String): MediaDataListResponse = handle {
            service.getMediaDataListByEntity(idEntity)
        }

        override suspend fun getMediaDataById(mediaDataId: String): MediaDataResponse = handle {
            service.getMediaDataById(mediaDataId)
        }

        override suspend fun downloadFile(url: String): ResponseBody = handle {
            service.downloadFile(url)
        }
    }
}