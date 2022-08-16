package com.progressterra.ipbandroidapi.api.ipbmediadatacore

import com.progressterra.ipbandroidapi.api.ipbmediadatacore.models.MediaDataListResponse
import com.progressterra.ipbandroidapi.api.ipbmediadatacore.models.MediaDataResponse
import com.progressterra.ipbandroidapi.api.ipbmediadatacore.models.UploadImageResponse
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Response


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

        /**
         * скачивает файл по заданному url
         */
        suspend fun downloadFile(url: String): Response<ResponseBody>
    }

    companion object {
        fun EntityMobile(): EntityMobile = IpbMediaDataCoreImpl()
    }
}