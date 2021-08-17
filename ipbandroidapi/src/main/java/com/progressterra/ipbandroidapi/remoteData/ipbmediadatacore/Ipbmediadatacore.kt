package com.progressterra.ipbandroidapi.remoteData.ipbmediadatacore

import com.progressterra.ipbandroidapi.remoteData.ipbmediadatacore.models.UploadImageResponse
import okhttp3.MultipartBody


/**
 * http://84.201.184.154:5089/docsapi/v1/index.html
 */
interface Ipbmediadatacore {
    interface EntityMobile {
        suspend fun uploadImage(
            accessToken: String,
            alias: String = "userdata",
            tag: String = "0",
            image: MultipartBody.Part
        ): UploadImageResponse
    }

}

fun Ipbmediadatacore(): Ipbmediadatacore.EntityMobile = IpbmediadatacoreImpl()