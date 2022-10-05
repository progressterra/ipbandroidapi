package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.model.*
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException
import java.util.*

interface ChecklistCloudDataSource {

    suspend fun createAnswer(request: DRAnswerChekListItemEntity): DRCheckListItemForDHPerformedViewModelResultData

    suspend fun updateAnswer(
        idRG: UUID, request: DRAnswerChekListItemUpdated
    ): DRCheckListItemForDHPerformedViewModelResultData

    suspend fun createChecklist(request: RFCheckEntity): RFCheckResultData

    suspend fun checklists(request: FilterAndSort): RFCheckResultDataList

    suspend fun checklistList(
        idRFComPlace: UUID, request: FilterAndSort
    ): RFCheckResultDataList

    suspend fun availableChecklists(): ComPlaceWithDataResultDataList

    suspend fun availableChecklistsForPlace(idComPlace: UUID): RFCheckViewModelResultDataList

    suspend fun availableDocsForPlace(
        idComPlace: UUID, request: FilterAndSort
    ): DHCheckPerformedViewModelResultDataList

    suspend fun createDoc(request: DHCheckPerformedEntity): DHCheckPerformedViewModelResultData

    suspend fun startCheck(idDH: UUID): DHCheckPerformedViewModelResultData

    suspend fun finishCheck(idDH: UUID, value: String): DHCheckPerformedViewModelResultData

    suspend fun checklistForDoc(idDH: UUID): DRCheckListItemForDHPerformedViewModelResultDataList

    class Base(
        private val service: ChecklistService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), ChecklistCloudDataSource {

        override suspend fun createAnswer(request: DRAnswerChekListItemEntity): DRCheckListItemForDHPerformedViewModelResultData = handle {
            service.createAnswer(request)
        }

        override suspend fun updateAnswer(
            idRG: UUID,
            request: DRAnswerChekListItemUpdated
        ): DRCheckListItemForDHPerformedViewModelResultData = handle {
            service.updateAnswer(idRG, request)
        }

        override suspend fun createChecklist(request: RFCheckEntity): RFCheckResultData = handle {
            service.createChecklist(request)
        }

        override suspend fun checklists(request: FilterAndSort): RFCheckResultDataList = handle {
            service.checklists(request)
        }

        override suspend fun checklistList(
            idRFComPlace: UUID,
            request: FilterAndSort
        ): RFCheckResultDataList = handle {
            service.checklistList(idRFComPlace, request)
        }

        override suspend fun availableChecklists(): ComPlaceWithDataResultDataList = handle {
            service.availableChecklists()
        }

        override suspend fun availableChecklistsForPlace(idComPlace: UUID): RFCheckViewModelResultDataList = handle {
            service.availableChecklistsForPlace(idComPlace)
        }

        override suspend fun availableDocsForPlace(
            idComPlace: UUID,
            request: FilterAndSort
        ): DHCheckPerformedViewModelResultDataList = handle {
            service.availableDocsForPlace(idComPlace, request)
        }

        override suspend fun createDoc(request: DHCheckPerformedEntity): DHCheckPerformedViewModelResultData = handle {
            service.createDoc(request)
        }

        override suspend fun startCheck(idDH: UUID): DHCheckPerformedViewModelResultData = handle {
            service.startCheck(idDH)
        }

        override suspend fun finishCheck(
            idDH: UUID,
            value: String
        ): DHCheckPerformedViewModelResultData = handle {
            service.finishCheck(idDH, value)
        }

        override suspend fun checklistForDoc(idDH: UUID): DRCheckListItemForDHPerformedViewModelResultDataList = handle {
            service.checklistForDoc(idDH)
        }
    }
}