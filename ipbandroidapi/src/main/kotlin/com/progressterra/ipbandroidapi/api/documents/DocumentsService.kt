package com.progressterra.ipbandroidapi.api.documents

import okhttp3.MultipartBody
import com.progressterra.ipbandroidapi.api.documents.models.DHDocSetFullDataResultData
import com.progressterra.ipbandroidapi.api.documents.models.DHDocSetViewModelResultDataList
import com.progressterra.ipbandroidapi.api.documents.models.IncomeDataClientArea
import com.progressterra.ipbandroidapi.api.documents.models.RFCharacteristicValueViewModelResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface DocumentsService {

    @POST("/clientarea/docset/spec/{idSpecification}")
    suspend fun docsBySpecification(
        @Header("AccessToken") accessToken: String,
        @Path("idSpecification") idSpecification: String
    ): DHDocSetFullDataResultData

    @GET("/clientarea/docset/{idDocSet}")
    suspend fun docsById(
        @Header("AccessToken") accessToken: String,
        @Path("idDocSet") idDocSet: String
    ): DHDocSetFullDataResultData

    @GET("/clientarea/docset/list")
    suspend fun allDocSets(
        @Header("AccessToken") accessToken: String
    ): DHDocSetViewModelResultDataList

    @POST("/clientarea/doc/data/{idCharVal}")
    suspend fun setValueForChar(
        @Header("AccessToken") accessToken: String,
        @Path("idCharVal") idCharVal: String,
        @Body incomeData: IncomeDataClientArea
    ): RFCharacteristicValueViewModelResultData

    @POST("/clientarea/doc/image/{idCharVal}")
    suspend fun setImageForChar(
        @Header("AccessToken") accessToken: String,
        @Path("idCharVal") idCharVal: String,
        @Part file: MultipartBody.Part
    ): RFCharacteristicValueViewModelResultData
}