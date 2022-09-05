package com.progressterra.ipbandroidapi.api.ipbmediadatacore

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.ipbmediadatacore.models.MediaDataListResponse
import com.progressterra.ipbandroidapi.api.ipbmediadatacore.models.MediaDataResponse
import com.progressterra.ipbandroidapi.api.ipbmediadatacore.models.UploadImageResponse
import com.progressterra.ipbandroidapi.core.NetworkService
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Response

internal class IpbMediaDataCoreImpl : IpbMediaDataCore.EntityMobile {

    private val networkService: NetworkService = NetworkService.Base()
    private val mediaDataCoreApi =
        networkService.createService(
            IpbMediaDataCoreApi::class.java,
            URL.IMAGE_DATA_CORE_URL
        )

    override suspend fun uploadImage(
        accessToken: String,
        alias: String,
        tag: String,
        image: MultipartBody.Part
    ): UploadImageResponse {
        return mediaDataCoreApi.uploadImage(accessToken, alias, tag, image)
    }

    override suspend fun getMediaDataListByEntity(idEntity: String): MediaDataListResponse {
        return mediaDataCoreApi.getMediaDataListByEntity(idEntity)
    }

    override suspend fun getMediaDataById(mediaDataId: String): MediaDataResponse {
        return mediaDataCoreApi.getMediaDataById(mediaDataId)
    }

    override suspend fun downloadFile(url: String): Response<ResponseBody> {
        return mediaDataCoreApi.downloadFile(url)
    }
}