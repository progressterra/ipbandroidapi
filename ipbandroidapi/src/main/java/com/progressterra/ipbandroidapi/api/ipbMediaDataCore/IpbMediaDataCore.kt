package com.progressterra.ipbandroidapi.api.ipbMediaDataCore

import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.UploadImageResponse
import okhttp3.MultipartBody


/**
 * http://84.201.188.117:5089/docsapi/v1/index.html
 */
interface IpbMediaDataCore {
    interface EntityMobile {
        suspend fun uploadImage(
            accessToken: String,
            alias: String = "userdata",
            tag: String = "0",
            image: MultipartBody.Part
        ): UploadImageResponse
    }

    companion object {
        fun EntityMobile(): EntityMobile = IpbMediaDataCoreImpl()
    }
}