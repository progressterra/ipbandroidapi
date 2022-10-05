package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.model.*
import retrofit2.http.*
import java.util.*

/**
 * [Docs](http://84.201.188.117:5105/swagger/index.html)
 */
interface ChecklistService {

    @POST("/answerchecklistitem")
    suspend fun createAnswer(@Body request: DRAnswerChekListItemEntity): DRCheckListItemForDHPerformedViewModelResultData

    @PATCH("/answerchecklistitem/{idRG}")
    suspend fun updateAnswer(
        @Path("idRG") idRG: UUID,
        @Body request: DRAnswerChekListItemUpdated
    ): DRCheckListItemForDHPerformedViewModelResultData

    @POST("/rfcheck")
    suspend fun createChecklist(@Body request: RFCheckEntity): RFCheckResultData

    @POST("/rfcheck/list")
    suspend fun checklists(@Body request: FilterAndSort): RFCheckResultDataList

    @POST("/rfcheck/complace/{idRFComPlace}/list")
    suspend fun checklistList(
        @Path("idRFComPlace") idRFComPlace: UUID,
        @Body request: FilterAndSort
    ): RFCheckResultDataList

    @GET("/place/list")
    suspend fun availableChecklists(): ComPlaceWithDataResultDataList

    @GET("/place/{idComPlace}/rfcheck/list")
    suspend fun availableChecklistsForPlace(@Path("idComPlace") idComPlace: UUID): RFCheckViewModelResultDataList

    @POST("/place/{idComPlace}/dhcheckperformed/list")
    suspend fun availableDocsForPlace(
        @Path("idComPlace") idComPlace: UUID,
        @Body request: FilterAndSort
    ): DHCheckPerformedViewModelResultDataList

    @POST("/dhcheckperformed")
    suspend fun createDoc(@Body request: DHCheckPerformedEntity): DHCheckPerformedViewModelResultData

    @POST("/dhcheckperformed/start/{idDH}")
    suspend fun startCheck(@Path("idDH") idDH: UUID): DHCheckPerformedViewModelResultData

    @POST("/dhcheckperformed/finish/{idDH}")
    suspend fun finishCheck(@Path("idDH") idDH: UUID, @Body value: String): DHCheckPerformedViewModelResultData

    @GET("/dhcheckperformed/item/{idDH}/list")
    suspend fun checklistForDoc(@Path("idDH") idDH: UUID): DRCheckListItemForDHPerformedViewModelResultDataList
}