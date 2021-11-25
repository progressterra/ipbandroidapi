package com.progressterra.ipbandroidapi.api.ipbMediaDataCore

import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.MediaDataListResponse
import com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models.MediaDataResponse
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

        /**
         * Получаение списка всех файлов, которые прикреплены к сущности
         */
        suspend fun getMediaDataListByEntity(idEntity: String): MediaDataListResponse

        /**
         * Выдает медиаданные по идентфиикатору медиаданных
         */
        suspend fun getMediaDataById(mediaDataId: String): MediaDataResponse
    }

    companion object {
        fun EntityMobile(): EntityMobile = IpbMediaDataCoreImpl()
    }
}