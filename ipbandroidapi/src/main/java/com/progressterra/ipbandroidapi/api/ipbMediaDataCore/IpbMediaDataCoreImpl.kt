package com.progressterra.ipbandroidapi.api.ipbMediaDataCore

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.UploadImageResponse
import okhttp3.MultipartBody

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
}