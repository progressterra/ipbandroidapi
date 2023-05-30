package com.progressterra.ipbandroidapi.api.ipbmediadata

import com.progressterra.ipbandroidapi.api.ipbmediadata.model.FilterAndSort
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.RGEntitytMediaDataViewModel
import com.progressterra.ipbandroidapi.api.ipbmediadata.model.RGEntitytMediaDataViewModelResultData
import okhttp3.MultipartBody
import java.io.InputStream

interface IPBMediaDataRepository {

    suspend fun attachToClient(
        accessToken: String, typeContent: String, alias: String, tag: Int, file: MultipartBody.Part
    ): Result<RGEntitytMediaDataViewModel?>

    suspend fun attachToEntity(
        accessToken: String,
        idEntity: String,
        entityTypeName: String,
        typeContent: String,
        alias: String,
        tag: Int,
        file: MultipartBody.Part
    ): Result<RGEntitytMediaDataViewModel?>

    suspend fun attachedToEntity(
        accessToken: String, idEntity: String, filterAndSort: FilterAndSort
    ): Result<List<RGEntitytMediaDataViewModel>?>

    suspend fun downloadFile(
        accessToken: String, url: String
    ): Result<InputStream>

    suspend fun deleteMediaData(
        accessToken: String, idRGEntitytMediaData: String
    ): Result<Unit>
}
