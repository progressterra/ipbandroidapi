package com.progressterra.ipbandroidapi.api.ipbMediaDataCore

import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.MediaDataListResponse
import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.MediaDataResponse
import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.UploadImageResponse
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Response

internal class IpbMediaDataCoreImpl : IpbMediaDataCore.EntityMobile {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val mediaDataCoreApi =
        networkService.createService(
            IpbMediaDataCoreApi::class.java,
            NetworkSettings.IMAGE_DATA_CORE_URL
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