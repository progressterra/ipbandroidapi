package com.progressterra.ipbandroidapi.remoteData.ipbMediaDataCore

import com.progressterra.ipbandroidapi.remoteData.ipbMediaDataCore.models.UploadImageResponse
import okhttp3.MultipartBody


/**
 * http://84.201.184.154:5089/docsapi/v1/index.html
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

    companion object{
        fun EntityMobile(): EntityMobile = IpbMediaDataCoreImpl()
    }
}