package com.progressterra.ipbandroidapi.remoteData.ipbmediadatacore

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.ipbmediadatacore.models.UploadImageResponse
import okhttp3.MultipartBody

internal class IpbmediadatacoreImpl : Ipbmediadatacore.EntityMobile {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val mediaDataCoreApi =
        networkService.createService(
            IpbmediadatacoreApi::class.java,
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