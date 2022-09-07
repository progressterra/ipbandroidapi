package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.models.MediaData
import com.progressterra.ipbandroidapi.api.ipbmediadata.models.MediaRaw
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
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

    class Base(
        private val cloudDataSource: IPBMediaDataCloudDataSource
    ) : AbstractRepository(), IPBMediaDataCoreRepository {

        override suspend fun uploadImage(
            accessToken: String,
            alias: String,
            tag: String,
            image: MultipartBody.Part
        ): Result<MediaData> = handle {
            val response = cloudDataSource.uploadImage(accessToken, alias, tag, image)
            if (response.status == 0)
                throw BadRequestException()
            response
        }.map { MediaData(it.uploadImageData ?: MediaRaw()) }

        override suspend fun getMediaDataListByEntity(idEntity: String): Result<List<MediaData>> = handle {
            val response = cloudDataSource.getMediaDataListByEntity(idEntity)
            if (response.status == 0)
                throw BadRequestException()
            response
        }.map { data -> data.mediaDataList?.map { MediaData(it) } ?: emptyList() }

        override suspend fun getMediaDataById(mediaDataId: String): Result<MediaData> = handle {
            val response = cloudDataSource.getMediaDataById(mediaDataId)
            if (response.status == 0)
                throw BadRequestException()
            response
        }.map { MediaData(it.mediaData ?: MediaRaw()) }

        override suspend fun downloadFile(url: String): Result<InputStream> = handle {
            cloudDataSource.downloadFile(url)
        }.map { it.byteStream() }
    }
}
