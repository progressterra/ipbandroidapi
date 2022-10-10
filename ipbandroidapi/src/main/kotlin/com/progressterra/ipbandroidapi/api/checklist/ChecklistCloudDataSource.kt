package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.model.*
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

interface ChecklistCloudDataSource {

    suspend fun createOrUpdateAnswer(
        accessToken: String,
        request: DRAnswerChekListItemEntity
    ): DRCheckListItemForDHPerformedViewModelResultData

    suspend fun createChecklist(
        accessToken: String,
        request: RFCheckEntity
    ): RFCheckResultData

    suspend fun checklists(
        accessToken: String,
        request: FilterAndSort
    ): RFCheckResultDataList

    suspend fun checklistsForPlace(
        accessToken: String,
        idRFComPlace: String,
        request: FilterAndSort
    ): RFCheckResultDataList

    suspend fun availableChecklistsAndDocs(accessToken: String): ComPlaceWithDataResultDataList

    suspend fun availableChecklistsForPlace(
        accessToken: String,
        idComPlace: String
    ): RFCheckViewModelResultDataList

    suspend fun availableDocsForPlace(
        accessToken: String,
        idComPlace: String,
        request: FilterAndSort
    ): DHCheckPerformedFullDataViewModelResultDataList

    suspend fun addChecklistToPlace(
        accessToken: String,
        request: RGComPlaceRFCheckEntity
    ): EmptyResultOperationResultData

    suspend fun createDoc(
        accessToken: String,
        request: DHCheckPerformedEntityCreate
    ): DHCheckPerformedFullDataViewModelResultData

    suspend fun startCheck(
        accessToken: String,
        idDH: String
    ): DHCheckPerformedFullDataViewModelResultData

    suspend fun finishCheck(
        accessToken: String,
        idDH: String,
        request: FinalCommentsInput
    ): DHCheckPerformedFullDataViewModelResultData

    suspend fun checklistForDoc(
        accessToken: String,
        idDH: String
    ): DRCheckListItemForDHPerformedViewModelResultDataList

    class Base(
        private val service: ChecklistService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), ChecklistCloudDataSource {
        override suspend fun createOrUpdateAnswer(
            accessToken: String,
            request: DRAnswerChekListItemEntity
        ): DRCheckListItemForDHPerformedViewModelResultData = handle {
            service.createOrUpdateAnswer(accessToken, request)
        }

        override suspend fun createChecklist(
            accessToken: String,
            request: RFCheckEntity
        ): RFCheckResultData = handle {
            service.createChecklist(accessToken, request)
        }

        override suspend fun checklists(
            accessToken: String,
            request: FilterAndSort
        ): RFCheckResultDataList = handle {
            service.checklists(accessToken, request)
        }

        override suspend fun checklistsForPlace(
            accessToken: String,
            idRFComPlace: String,
            request: FilterAndSort
        ): RFCheckResultDataList = handle {
            service.checklistsForPlace(accessToken, idRFComPlace, request)
        }

        override suspend fun availableChecklistsAndDocs(accessToken: String): ComPlaceWithDataResultDataList =
            handle {
                service.availableChecklistsAndDocs(accessToken)
            }

        override suspend fun availableChecklistsForPlace(
            accessToken: String,
            idComPlace: String
        ): RFCheckViewModelResultDataList = handle {
            service.availableChecklistsForPlace(accessToken, idComPlace)
        }

        override suspend fun availableDocsForPlace(
            accessToken: String,
            idComPlace: String,
            request: FilterAndSort
        ): DHCheckPerformedFullDataViewModelResultDataList = handle {
            service.availableDocsForPlace(accessToken, idComPlace, request)
        }

        override suspend fun addChecklistToPlace(
            accessToken: String,
            request: RGComPlaceRFCheckEntity
        ): EmptyResultOperationResultData = handle {
            service.addChecklistToPlace(accessToken, request)
        }

        override suspend fun createDoc(
            accessToken: String,
            request: DHCheckPerformedEntityCreate
        ): DHCheckPerformedFullDataViewModelResultData = handle {
            service.createDoc(accessToken, request)
        }

        override suspend fun startCheck(
            accessToken: String,
            idDH: String
        ): DHCheckPerformedFullDataViewModelResultData = handle {
            service.startCheck(accessToken, idDH)
        }

        override suspend fun finishCheck(
            accessToken: String,
            idDH: String,
            request: FinalCommentsInput
        ): DHCheckPerformedFullDataViewModelResultData = handle {
            service.finishCheck(accessToken, idDH, request)
        }

        override suspend fun checklistForDoc(
            accessToken: String,
            idDH: String
        ): DRCheckListItemForDHPerformedViewModelResultDataList = handle {
            service.checklistForDoc(accessToken, idDH)
        }
    }
}