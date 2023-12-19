package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.models.ComPlaceWithDataResultDataList
import com.progressterra.ipbandroidapi.api.checklist.models.DHCheckPerformedEntityCreate
import com.progressterra.ipbandroidapi.api.checklist.models.DHCheckPerformedFullDataViewModelResultData
import com.progressterra.ipbandroidapi.api.checklist.models.DHCheckPerformedFullDataViewModelResultDataList
import com.progressterra.ipbandroidapi.api.checklist.models.DRAnswerChekListItemEntity
import com.progressterra.ipbandroidapi.api.checklist.models.DRCheckListItemForDHPerformedViewModelResultData
import com.progressterra.ipbandroidapi.api.checklist.models.DRCheckListItemForDHPerformedViewModelResultDataList
import com.progressterra.ipbandroidapi.api.checklist.models.DRCheckListItemViewModelResultDataList
import com.progressterra.ipbandroidapi.api.checklist.models.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.checklist.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.checklist.models.FinalCommentsInput
import com.progressterra.ipbandroidapi.api.checklist.models.RFCheckResultDataList
import com.progressterra.ipbandroidapi.api.checklist.models.RFCheckViewModelResultDataList
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * [Docs](http://84.201.188.117:5105/swagger/index.html)
 */
interface ChecklistService {

    @POST("/dhcheckperformed/{idDH}/send/{email}")
    suspend fun sendOnEmail(
        @Header("AccessToken") accessToken: String,
        @Path("idDH") idDH: String,
        @Path("email") email: String
    ): EmptyResultOperationResultData

    @POST("/answerchecklistitem")
    suspend fun createOrUpdateAnswer(
        @Header("AccessToken") accessToken: String,
        @Body request: DRAnswerChekListItemEntity
    ): DRCheckListItemForDHPerformedViewModelResultData

    @POST("/rfcheck/complace/{idRFComPlace}/list")
    suspend fun checklistsForPlace(
        @Header("AccessToken") accessToken: String,
        @Path("idRFComPlace") idRFComPlace: String,
        @Body request: FilterAndSort
    ): RFCheckResultDataList

    @POST("/rfcheck/{idRFCheck}/item/list")
    suspend fun checklistElements(
        @Header("AccessToken") accessToken: String,
        @Path("idRFCheck") idRFCheck: String,
        @Body request: FilterAndSort
    ): DRCheckListItemViewModelResultDataList

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

    @POST("/dhcheckperformed/list")
    suspend fun allDocuments(
        @Header("AccessToken") accessToken: String,
        @Body request: FilterAndSort
    ): DHCheckPerformedFullDataViewModelResultDataList

    @POST("/dhcheckperformed")
    suspend fun createDoc(
        @Header("AccessToken") accessToken: String,
        @Body request: DHCheckPerformedEntityCreate
    ): DHCheckPerformedFullDataViewModelResultData

    @GET("/dhcheckperformed/active")
    suspend fun activeDoc(
        @Header("AccessToken") accessToken: String,
        @Query("idRFComPlace") placeId: String,
        @Query("idRFCheck") checklistId: String
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