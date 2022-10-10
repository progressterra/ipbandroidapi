package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.model.*
import retrofit2.http.*

/**
 * [Docs](http://84.201.188.117:5105/swagger/index.html)
 */
interface ChecklistService {

    @POST("/answerchecklistitem")
    suspend fun createOrUpdateAnswer(
        @Header("AccessToken") accessToken: String,
        @Body request: DRAnswerChekListItemEntity
    ): DRCheckListItemForDHPerformedViewModelResultData

    @POST("/rfcheck")
    suspend fun createChecklist(
        @Header("AccessToken") accessToken: String,
        @Body request: RFCheckEntity
    ): RFCheckResultData

    @POST("/rfcheck/list")
    suspend fun checklists(
        @Header("AccessToken") accessToken: String,
        @Body request: FilterAndSort
    ): RFCheckResultDataList

    @POST("/rfcheck/complace/{idRFComPlace}/list")
    suspend fun checklistsForPlace(
        @Header("AccessToken") accessToken: String,
        @Path("idRFComPlace") idRFComPlace: String,
        @Body request: FilterAndSort
    ): RFCheckResultDataList

    @GET("/place/list")
    suspend fun availableChecklistsAndDocs(@Header("AccessToken") accessToken: String): ComPlaceWithDataResultDataList

    @GET("/place/{idComPlace}/rfcheck/list")
    suspend fun availableChecklistsForPlace(
        @Header("AccessToken") accessToken: String,
        @Path("idComPlace") idComPlace: String
    ): RFCheckViewModelResultDataList

    @POST("/place/{idComPlace}/dhcheckperformed/list")
    suspend fun availableDocsForPlace(
        @Header("AccessToken") accessToken: String,
        @Path("idComPlace") idComPlace: String,
        @Body request: FilterAndSort
    ): DHCheckPerformedFullDataViewModelResultDataList

    @POST("/place/rgcomplacerfcheck")
    suspend fun addChecklistToPlace(
        @Header("AccessToken") accessToken: String,
        @Body request: RGComPlaceRFCheckEntity
    ): EmptyResultOperationResultData

    @POST("/dhcheckperformed/list")
    suspend fun allDocuments(
        @Header("AccessToken") accessToken: String,
        @Body request: FilterAndSort
    ) : DHCheckPerformedFullDataViewModelResultDataList

    @POST("/dhcheckperformed")
    suspend fun createDoc(
        @Header("AccessToken") accessToken: String,
        @Body request: DHCheckPerformedEntityCreate
    ): DHCheckPerformedFullDataViewModelResultData

    @POST("/dhcheckperformed/start/{idDH}")
    suspend fun startCheck(
        @Header("AccessToken") accessToken: String,
        @Path("idDH") idDH: String
    ): DHCheckPerformedFullDataViewModelResultData

    @POST("/dhcheckperformed/finish/{idDH}")
    suspend fun finishCheck(
        @Header("AccessToken") accessToken: String,
        @Path("idDH") idDH: String,
        @Body request: FinalCommentsInput
    ): DHCheckPerformedFullDataViewModelResultData

    @GET("/dhcheckperformed/item/{idDH}/list")
    suspend fun checklistForDoc(
        @Header("AccessToken") accessToken: String,
        @Path("idDH") idDH: String
    ): DRCheckListItemForDHPerformedViewModelResultDataList
}